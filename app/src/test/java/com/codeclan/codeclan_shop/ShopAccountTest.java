package com.codeclan.codeclan_shop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ShopAccountTest {

    ShopAccount shop1;

    @Before
    public void before(){
        shop1 = new ShopAccount("Yan's Sweeties", 6170998, 3000, 100);
    }

    @Test
    public void shopAccountHasName() {
        assertEquals("Yan's Sweeties", shop1.getName());
    }

    @Test
    public void couldSetShopName() {
        shop1.setName("Donald's Sweeties");
        assertEquals("Donald's Sweeties", shop1.getName());
    }

    @Test
    public void shopAccountHasVatNumber() {
        assertEquals(6170998, shop1.getVatNumber());
    }

    @Test
    public void couldSetVatNumber() {
        shop1.setVatNumber(6120998);
        assertEquals(6120998, shop1.getVatNumber());
    }

    @Test
    public void couldGetShopAccountSales() {
        assertEquals(3000, shop1.getSales());
    }

    @Test
    public void couldGetShopAccountRefund() {
        assertEquals(100, shop1.getRefund());
    }


    @Test
    public void couldDoSales() {
        int sales = 10;
        shop1.makeSales(sales);
        assertEquals(3010, shop1.getSales());
    }

    @Test
    public void couldDoRefund() {
        int refund = 10;
        shop1.makeRefund(refund);
        assertEquals(110, shop1.getRefund());
    }

    @Test
    public void couldDoTotalSales() {
        int sales = 20;
        int refund = 10;
        shop1.makeSales(sales);
        shop1.makeRefund(refund);
        assertEquals(2910, shop1.totalSales());
    }

}