package com.codeclan.codeclan_shop;

import java.util.Date;

/**
 * Created by yanren on 14/08/2017.
 */

public class Transaction {

    private int transanctionBarcodeNumber;
    private Product product;
    private int productSoldQuantity;
    private Customer customer;
    private Date transactionDate;
    private ShopAccount shop;

    public Transaction(int transanctionBarcodeNumber, Product product, int productSoldQuantity, Customer customer, Date transactionDate, ShopAccount shop) {
        this.transanctionBarcodeNumber = transanctionBarcodeNumber;
        this.product = product;
        this.productSoldQuantity = productSoldQuantity;
        this.customer = customer;
        this.transactionDate = transactionDate;
        this.shop = shop;
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

    public int getProductSoldQuantity() {
        return this.productSoldQuantity;
    }

    public void setProductSoldQuantity(int productSoldQuantity) {
        this.productSoldQuantity = productSoldQuantity;
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

    public void sales(Product product) {
// shop totalSum goes up; customer wallet goes down; product stock goes down
        //customer has enough fund in preferred paymentType
        PaymentType x = this.customer.getPreferredPaymentType();
        int sales = product.getPrice() * this.productSoldQuantity
        if (this.customer.getWallet().get(x) > sales) {
            this.shop.addSales(sales);
            this.customer.getWallet().get(x)
            this.product.stockLevelAfterSales(this.productSoldQuantity);
        }


    }

    public void refund(Product product) {

    }

}

