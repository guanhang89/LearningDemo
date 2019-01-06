package com.guanhang.adapterpattern.objectadapter;

public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;
    public String getCreditCardNo() {
        return creditCardNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCardExpMonth() {
        return cardExpMonth;
    }

    public String getCardExpYear() {
        return cardExpYear;
    }

    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setCreditCardNo(String creditCardNo) {

    }

    public void setCustomerName(String customerName) {

    }

    public void setCardExpMonth(String cardExpMonth) {

    }

    public void setCardExpYear(String cardExpYear) {

    }

    public void setCardCVVNo(Short cardCVVNo) {

    }

    public void setAmount(Double amount) {

    }
}
