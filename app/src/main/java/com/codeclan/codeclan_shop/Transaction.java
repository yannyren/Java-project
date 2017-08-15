package com.codeclan.codeclan_shop;

import java.util.Date;

/**
 * Created by yanren on 14/08/2017.
 */

public class Transaction {

    private int transanctionBarcodeNumber;
    private Product product;
    private int salesAmount;
    private Customer customer;
    private Date transactionDate;
    private int price;
    private int vatNumber;

    public Transaction(int transanctionBarcodeNumber, Product product, int salesAmount, Customer customer, Date transactionDate, int price, int vatNumber) {
        this.transanctionBarcodeNumber = transanctionBarcodeNumber;
        this.product = product;
        this.salesAmount = salesAmount;
        this.customer = customer;
        this.transactionDate = transactionDate;
        this.price = price;
        this.vatNumber = vatNumber;
    }

    public int getTransanctionBarcodeNumber() {
        return transanctionBarcodeNumber;
    }

    public void setTransanctionBarcodeNumber(int transanctionBarcodeNumber) {
        this.transanctionBarcodeNumber = transanctionBarcodeNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }
}
