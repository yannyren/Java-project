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
        shop1 = new ShopAccount("Yan's Sweeties", 6170998, 30000);
    }

    @Test
    public void shopAccountHasName() {
        assertEquals("Yan's Sweeties", shop1.getName());
    }

    @Test
    public void shopAccountHasVatNumber() {
        assertEquals(6170998, shop1.getVatNumber());
    }

    @Test
    public void shopAccountHasTotalSum() {
        assertEquals(30000, shop1.getTotalSum());
    }


}