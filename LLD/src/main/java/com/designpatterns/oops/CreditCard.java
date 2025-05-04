package com.designpatterns.oops;

public class CreditCard extends  Card implements PaymentMethod{

    public CreditCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
      System.out.println("Make payment using Credit Card");
    }
}
