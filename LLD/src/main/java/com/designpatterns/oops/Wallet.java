package com.designpatterns.oops;

public class Wallet implements PaymentMethod {

    private String walletId;

    public Wallet(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay() {
      System.out.println("Make a payment using wallet");
    }
}
