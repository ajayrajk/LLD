package com.designpatterns.oops;

import java.util.HashMap;

public class PaymentService {

    //Storing payment methods + Making payments
    HashMap<String  , PaymentMethod> paymentMethod;

    PaymentService() {
        paymentMethod= new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
       paymentMethod.put(name,pm);
    }

    public void makePaymentMethod(String name){
        PaymentMethod pm=paymentMethod.get(name);
        pm.pay();  //Run time polymorphism
    }
}
