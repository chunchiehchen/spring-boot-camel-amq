package dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WhateverRequest {

    private MWHEADER mwHeader;
    private TRANRQ tranRQ;

    @Override
    public String toString() {
        return mwHeader.toString() + tranRQ.toString();
    }

    public MWHEADER getMwHeader() {
        return mwHeader;
    }

    public void setMwHeader(MWHEADER mwHeader) {
        this.mwHeader = mwHeader;
    }

    public TRANRQ getTranRQ() {
        return tranRQ;
    }

    public void setTranRQ(TRANRQ tranRQ) {
        this.tranRQ = tranRQ;
    }
}
