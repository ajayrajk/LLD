package com.designpatterns.oops;

public class DebitCard extends Card implements PaymentMethod{
    public DebitCard(String cardNo, String name) {
        super(cardNo, name);
    }


    @Override
    public void pay() {
      System.out.println("Make payment using Debit Card"+cardNo);
    }
}
