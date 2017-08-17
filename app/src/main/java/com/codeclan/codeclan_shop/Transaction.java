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
    private String transactionDate;
    private ShopAccount shop;

    public Transaction(int transanctionBarcodeNumber, Product product, int productSoldQuantity, Customer customer, String transactionDate, ShopAccount shop) {
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

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void sales() {
        // shop totalSum goes up; customer wallet goes down; product stock goes down

        //check stock level and customer total fund first

        if (this.product.getStock() >= this.productSoldQuantity && this.customer.totalFundAvailable() >= this.product.getPrice() * this.productSoldQuantity) {
            int priceToPayForCustomer = this.product.getPrice() * this.productSoldQuantity;
            this.product.sellStock(this.getProductSoldQuantity());
            this.customer.payForShopping(priceToPayForCustomer);
            this.shop.makeSales(priceToPayForCustomer);
        }
    }

    public void refund(Product product) {

    }

//   public void

}

