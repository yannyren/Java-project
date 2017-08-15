package com.codeclan.codeclan_shop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanren on 15/08/2017.
 */

public class TransactionTest {

    Transaction transaction1;
    Product jellyBeans;


    @Before
    public void before(){
        jellyBeans = new Product("Jelly Beans", 456789, 3, "US", 400);
        transaction1 = new Transaction(320987, jellyBeans, 30, );
    }

    @Test
    public void shopAccountHasName() {
        assertEquals("Yan's Sweeties", shop1.getName());
    }




}
