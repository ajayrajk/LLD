package com.designpatterns.oops;

public class UPI implements PaymentMethod{
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
      System.out.println("Make a payment by UPI ID");
    }
}
