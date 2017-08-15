package com.codeclan.codeclan_shop;
import java.math.BigDecimal;

/**
 * Created by yanren on 14/08/2017.
 */

public class ShopAccount {
    private String name;
    private int vatNumber;
    private int totalSum;

    public ShopAccount(String name, int vatNumber, int totalSum) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Transaction transaction) {
        this.totalSum += transaction.getPrice();
    }
}
