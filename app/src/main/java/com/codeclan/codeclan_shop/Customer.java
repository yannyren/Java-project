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

    private void deductFromWallet(int billAmount) {
        // loop round each payment method
        for (HashMap<PaymentType, Integer> method: this.wallet) {
            // loop round each balance inside the current method
            for (PaymentType type: method.keySet()) {
                // get the balance
                int balance = method.get(type);
                // get the minimum of the balance and the remaining billAmount
                // stops negative balances
                int value = Math.min(balance, billAmount);
                // update the balance with the new amount
                method.put(type, balance - value);
                // subtract the amount we just paid from the total bill amount
                billAmount -= value;

                if (billAmount == 0)
                    return;
            }
        }
    }

    public void payForShopping(int billAmount) {
        int f = totalFundAvailable();

        if (f < billAmount) {
            System.out.println("Sorry, I don't have enough money for it.");
        }
        else {
            deductFromWallet(billAmount);
        }
    }


    public void receivingRefund(PaymentType x, int refund) {
        /* check if this method exists; if yes, refund to that method; if no, no refund*/
        for (HashMap<PaymentType, Integer> i: this.wallet) {
            for (PaymentType type: i.keySet()) {
              if (type.equals(x)){
                int value = i.get(x);
                i.put(type, value + refund);
              }
            }
        }
    }




}