package com.codeclan.codeclan_shop;

import java.util.HashMap;

/**
 * Created by yanren on 14/08/2017.
 */

public class Customer {
    private String name;
    private PaymentType preferredPaymentType;
    private HashMap<PaymentType, Integer> wallet;

    public Customer(String name, PaymentType preferredPaymentType, HashMap<PaymentType, Integer> wallet) {
        this.name = name;
        this.preferredPaymentType = preferredPaymentType;
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

    public PaymentType getPreferredPaymentType() {
        return this.preferredPaymentType;
    }

    public void setPreferredPaymentType(PaymentType newPreferredPaymentType) {
        this.preferredPaymentType = newPreferredPaymentType;
    }

    public HashMap<PaymentType, Integer> getWallet() {
        return this.wallet;
    }

    public void setWallet(HashMap<PaymentType, Integer> newWallet) {
        this.wallet = newWallet;
    }

    public int totalFundAvailable() {
        int totalFundAvailable = 0;
        for (Integer i : this.wallet.values()) {
            totalFundAvailable += i.intValue();
        }
        return totalFundAvailable;
    }

    public void walletChangeAfterSales() {

    }








}
