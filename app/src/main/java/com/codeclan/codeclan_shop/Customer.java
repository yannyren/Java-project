package com.codeclan.codeclan_shop;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yanren on 14/08/2017.
 */

public class Customer {
    private String name;
    private ArrayList<HashMap<PaymentType, Integer>> wallet;

    public Customer(String name, ArrayList<HashMap<PaymentType, Integer>> wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public  ArrayList<HashMap<PaymentType, Integer>> getWallet() {
        return this.wallet;
    }

    public void setWallet(ArrayList<HashMap<PaymentType, Integer>> newWallet) {
        this.wallet = newWallet;
    }

    public HashMap<PaymentType, Integer> getPreferredPayment() {
        return this.wallet.get(0);
    }

    public int totalFundAvailable() {
        int totalFundAvailable = 0;

        for (int i = 0; i < wallet.size(); i++) {

            HashMap<PaymentType, Integer> tempHashMap = this.wallet.get(i);
            for (Integer f: tempHashMap.values()) {
                totalFundAvailable += f.intValue();
            }

        }

        return totalFundAvailable;
    }

    public int payForShopping() {

    }

    public int receivingRefund() {

    }



}
