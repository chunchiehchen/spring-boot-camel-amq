package codec;

import java.nio.ByteOrder;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class LengthDecoder extends LengthFieldBasedFrameDecoder implements CodesLengthFormat {
	private byte type = TEXT_FORMAT;
	
	public LengthDecoder (String type, int maxFrameLength, int lengthFieldOffset, int lengthFieldLength,  
            int lengthAdjustment, int initialBytesToStrip) {
		super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
				lengthAdjustment, initialBytesToStrip);
		switch (type) {
			case "T":
				this.type=TEXT_FORMAT;
				break;
			case "B":
				this.type=HEX_BE_FORMAT;
				break;
			case "b":
				this.type=HEX_LE_FORMAT;
				break;
			case "P":
				this.type=BCD_FORMAT;
				break;
		}
	}
	
	@Override 
	protected long getUnadjustedFrameLength(ByteBuf buf, int offset, int length, ByteOrder order) {
		long frameLength = 0;
		byte[] baLen = null;
		ByteBuf tmp = null;
		
		switch (type) {
			case HEX_BE_FORMAT:
				frameLength = super.getUnadjustedFrameLength(buf, offset, length, ByteOrder.BIG_ENDIAN);
				break;
			case HEX_LE_FORMAT:
				frameLength = super.getUnadjustedFrameLength(buf, offset, length, ByteOrder.LITTLE_ENDIAN);
				break;
			case BCD_FORMAT:
				baLen = new byte[length];
				
				tmp = buf.getBytes(offset, baLen, 0, baLen.length);
				for (int i = 0; i < baLen.length; i++) {
					int i0 = baLen[i] / 16;
					int i1 = baLen[i] % 16;

					frameLength = frameLength * 100 + i0 * 10 + i1;
				}
				break;
			case TEXT_FORMAT:
			default:
//				buf = buf.order(order);
				baLen = new byte[length];
				
				tmp = buf.getBytes(offset, baLen, 0, baLen.length);
				
//				System.out.println("tmp=" + tmp);
//				System.out.println("baLen=" + new String(baLen));
				frameLength = Integer.parseInt(new String(baLen));
				break;
		}

//		System.out.println("getUnadjustedFrameLength() " + buf.refCnt()); 
		
        return frameLength;
	}
}
