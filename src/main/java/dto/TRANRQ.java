package dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TRANRQ {

    String BranchId; // "9999"
    String TellerId; // "00000"
    String FnsFlagX; // " "
    String AccountNo; // "00000001035001766"
    String InqStartDate; // "29102008"
    String InqStartTime; // "094000"
    String InqEndDate; // "29102008"
    String InqEndTime; // "195000"
    String DateType; // "2"
    String SortType; // "A"
    String LastKey; // " "

    @Override
    public String toString() {
        return String.format("%s%s%s%s%s%s%s%s%s%s%s", //
                BranchId.substring(0), //
                TellerId.substring(0), //
                FnsFlagX.substring(0), //
                AccountNo.substring(0), //
                InqStartDate.substring(0), //
                InqStartTime.substring(0), //
                InqEndDate.substring(0), //
                InqEndTime.substring(0), //
                DateType.substring(0), //
                SortType.substring(0), //
                LastKey.substring(0) //
        );
    }

    public String getBranchId() {
        return BranchId;
    }

    public void setBranchId(String branchId) {
        BranchId = branchId;
    }

    public String getTellerId() {
        return TellerId;
    }

    public void setTellerId(String tellerId) {
        TellerId = tellerId;
    }

    public String getFnsFlagX() {
        return FnsFlagX;
    }

    public void setFnsFlagX(String fnsFlagX) {
        FnsFlagX = fnsFlagX;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getInqStartDate() {
        return InqStartDate;
    }

    public void setInqStartDate(String inqStartDate) {
        InqStartDate = inqStartDate;
    }

    public String getInqStartTime() {
        return InqStartTime;
    }

    public void setInqStartTime(String inqStartTime) {
        InqStartTime = inqStartTime;
    }

    public String getInqEndDate() {
        return InqEndDate;
    }

    public void setInqEndDate(String inqEndDate) {
        InqEndDate = inqEndDate;
    }

    public String getInqEndTime() {
        return InqEndTime;
    }

    public void setInqEndTime(String inqEndTime) {
        InqEndTime = inqEndTime;
    }

    public String getDateType() {
        return DateType;
    }

    public void setDateType(String dateType) {
        DateType = dateType;
    }

    public String getSortType() {
        return SortType;
    }

    public void setSortType(String sortType) {
        SortType = sortType;
    }

    public String getLastKey() {
        return LastKey;
    }

    public void setLastKey(String lastKey) {
        LastKey = lastKey;
    }

}
