package codec;

import java.nio.ByteOrder;

import org.apache.camel.component.netty4.ChannelHandlerFactory;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;

public class Coder {
	private Coder() {
    }

    public static ChannelHandlerFactory newLengthFieldBasedFrameDecoder(final String type, final int maxFrameLength, final int lengthFieldOffset,
                                                                        final int lengthFieldLength, final int lengthAdjustment,
                                                                        final int initialBytesToStrip) {
        return new ChannelHandlerFactory() {
            @Override
            public io.netty.channel.ChannelHandler newChannelHandler() {
                return new LengthDecoder(type, maxFrameLength,lengthFieldOffset,lengthFieldLength,  
                        lengthAdjustment, initialBytesToStrip);
            }

			@Override
			public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
				// TODO Auto-generated method stub
				
			}
        };
    }
    
    public static ChannelHandlerFactory newLengthFieldPrepender(final boolean type, final ByteOrder byteOrder, final int lengthFieldLength, final int lengthAdjustment,
			final boolean lengthIncludesLengthFieldLength) {
				return new ChannelHandlerFactory() {

					@Override
					public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
						// TODO Auto-generated method stub
						
					}

					@Override
					public ChannelHandler newChannelHandler() {
						// TODO Auto-generated method stub
						return new LengthPrepender(type,
					            byteOrder,lengthFieldLength,
					            lengthAdjustment, lengthIncludesLengthFieldLength);
					}};}
    public static ChannelHandlerFactory myLengthFieldPrepender(final boolean type, final ByteOrder byteOrder, final int lengthFieldLength, final int lengthAdjustment,
			final boolean lengthIncludesLengthFieldLength) {
				return new ChannelHandlerFactory() {

					@Override
					public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
						// TODO Auto-generated method stub
						
					}

					@Override
					public ChannelHandler newChannelHandler() {
						// TODO Auto-generated method stub
						return new LengthPrepender(type, byteOrder,lengthFieldLength,lengthAdjustment,
								lengthIncludesLengthFieldLength);
					}};}
}
