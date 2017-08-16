package com.codeclan.codeclan_shop;
import java.math.BigDecimal;

/**
 * Created by yanren on 14/08/2017.
 */

public class ShopAccount {
    private String name;
    private int vatNumber;
    private int sales;
    private int refund;

    public ShopAccount(String name, int vatNumber, int sales, int refund) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.sales = sales;
        this.refund = refund;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVatNumber() {
        return this.vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    public int getSales() {
        return this.sales;
    }

    public int getRefund() {
        return this.refund;
    }

    public int makeSales(int sales) {
        return this.sales += sales;
    }

    public int makeRefund(int refund) {
        return this.refund += refund;
    }

    public int totalSales() {
        int totalSales = this.sales - this.refund;
        return totalSales;
    }

}
