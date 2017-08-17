package com.codeclan.codeclan_shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanren on 15/08/2017.
 */

public class ProductTest {
    Product jellyBeans;

    @Before
    public void before() {
        jellyBeans = new Product("Jelly Beans", 456789, 3, "US", 400);
    }

    @Test
    public void productHasName() {
        assertEquals("Jelly Beans", jellyBeans.getName());
    }

    @Test
    public void couldSetProductName() {
        jellyBeans.setName("Jelly Fish");
        assertEquals("Jelly Fish", jellyBeans.getName());
    }

    @Test
    public void HasProductBarcode() {
        assertEquals(456789, jellyBeans.getProductBarcodeNumber());
    }

    @Test
    public void couldSetProductBarcode() {
        jellyBeans.setProductBarcodeNumber(456777);
        assertEquals(456777, jellyBeans.getProductBarcodeNumber());
    }

    @Test
    public void HasPrice() {
        assertEquals(3, jellyBeans.getPrice());
    }

    @Test
    public void couldSetPrice() {
        jellyBeans.setPrice(4);
        assertEquals(4, jellyBeans.getPrice());
    }

    @Test
    public void HasProductOrigin() {
        assertEquals("US", jellyBeans.getOrigin());
    }

    @Test
    public void couldSetProductOrigin() {
        jellyBeans.setOrigin("UK");
        assertEquals("UK", jellyBeans.getOrigin());
    }

    @Test
    public void HasStock() {
        assertEquals(400, jellyBeans.getStock());
    }

    @Test
    public void couldSetStock() {
        jellyBeans.setStock(456);
        assertEquals(456, jellyBeans.getStock());
    }

    @Test
    public void couldSellStock() {
        jellyBeans.sellStock(30);
        assertEquals(370, jellyBeans.getStock());
    }

    @Test
    public void couldRefundStock() {
        jellyBeans.refundStock(30);
        assertEquals(430, jellyBeans.getStock());
    }
}
