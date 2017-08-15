package com.codeclan.codeclan_shop;

import java.util.HashMap;

/**
 * Created by yanren on 14/08/2017.
 */

public class Customer {
    private String name;
    private PaymentType paymentType;
    private HashMap<PaymentType, Integer> wallet;

    public Customer(String name, PaymentType paymentType, HashMap<PaymentType, Integer> wallet) {
        this.name = name;
        this.paymentType = paymentType;
        this.wallet = wallet;
    }

//    private void setUpWallet() {
//        wallet = new HashMap<PaymentType, Integer>();
//        wallet.put(PaymentType.CASH, 200);
//        wallet.put(PaymentType.CREDIT_CARD, 2000);
//        wallet.put(PaymentType.DEBIT_CARD, 100);
//    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(PaymentType newPaymentType) {
        this.paymentType = newPaymentType;
    }

    public int totalFundAvailable() {
        int totalFundAvailable = 0;
        for (Integer i : this.wallet.values()) {
            totalFundAvailable += i.intValue();
        }
        return totalFundAvailable;
    }



}
