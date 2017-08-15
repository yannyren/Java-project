package com.codeclan.codeclan_shop;

/**
 * Created by yanren on 14/08/2017.
 */

public class Product {
    private String name;
    private int productBarcodeNumber;
    private int price;
    private String origin;
    private int stock;

    public Product(String name, int productBarcodeNumber, int price, String origin, int stock) {
        this.name = name;
        this.productBarcodeNumber = productBarcodeNumber;
        this.price = price;
        this.origin = origin;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductBarcodeNumber() {
        return productBarcodeNumber;
    }

    public void setProductBarcodeNumber(int productBarcodeNumber) {
        this.productBarcodeNumber = productBarcodeNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
