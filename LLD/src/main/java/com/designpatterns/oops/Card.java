package com.designpatterns.oops;

abstract  class Card implements PaymentMethod{
    protected String cardNo;

    protected String userName;

    public Card(String cardNo, String name) {
        this.cardNo = cardNo;
        this.userName = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getName() {
        return userName;
    }
}
