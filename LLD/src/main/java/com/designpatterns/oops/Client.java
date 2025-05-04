package com.designpatterns.oops;

public class Client {

    public static void main(String [] args){
        PaymentService ps=new PaymentService();
        ps.addPaymentMethod("AjayDebitCar",new DebitCard("123456789987432","Ajay Rajput"));
        ps.addPaymentMethod("AjayCreditCard",new CreditCard("45672","Ajay Rajput"));
        ps.addPaymentMethod("AjayUPI",new UPI("ajayhbti11@gmail.com"));
        ps.addPaymentMethod("AjayWallet",new Wallet("walletId"));
        ps.makePaymentMethod("AjayUPI");
        ps.makePaymentMethod("AjayCreditCard");
        ps.makePaymentMethod("AjayWallet");
    }
}
