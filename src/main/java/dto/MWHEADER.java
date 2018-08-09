package dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class MWHEADER {

    String MSGID; // FNSTXN0003
    String SOURCECHANNEL; // EBT-NT-B2C-01
    String RETURNCODE; //
    String RETURNDESC; //
    String RETURNCODECHANNEL; //
    String TXNSEQ; // 200811141745
    String O360SEQ; //

    @Override
    public String toString() {
        return String.format("%s%s%s%s%s%s%s", //
                MSGID.substring(0), //
                SOURCECHANNEL.substring(0), //
                RETURNCODE.substring(0), //
                RETURNDESC.substring(0), //
                RETURNCODECHANNEL.substring(0), //
                TXNSEQ.substring(0), //
                O360SEQ.substring(0) //
        );
    }

    public String getMSGID() {
        return MSGID;
    }

    public void setMSGID(String mSGID) {
        MSGID = mSGID;
    }

    public String getSOURCECHANNEL() {
        return SOURCECHANNEL;
    }

    public void setSOURCECHANNEL(String sOURCECHANNEL) {
        SOURCECHANNEL = sOURCECHANNEL;
    }

    public String getRETURNCODE() {
        return RETURNCODE;
    }

    public void setRETURNCODE(String rETURNCODE) {
        RETURNCODE = rETURNCODE;
    }

    public String getRETURNDESC() {
        return RETURNDESC;
    }

    public void setRETURNDESC(String rETURNDESC) {
        RETURNDESC = rETURNDESC;
    }

    public String getRETURNCODECHANNEL() {
        return RETURNCODECHANNEL;
    }

    public void setRETURNCODECHANNEL(String rETURNCODECHANNEL) {
        RETURNCODECHANNEL = rETURNCODECHANNEL;
    }

    public String getTXNSEQ() {
        return TXNSEQ;
    }

    public void setTXNSEQ(String tXNSEQ) {
        TXNSEQ = tXNSEQ;
    }

    public String getO360SEQ() {
        return O360SEQ;
    }

    public void setO360SEQ(String o360seq) {
        O360SEQ = o360seq;
    }

}
