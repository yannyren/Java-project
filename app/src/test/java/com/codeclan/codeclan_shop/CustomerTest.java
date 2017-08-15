package com.codeclan.codeclan_shop;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by yanren on 14/08/2017.
 */

public class CustomerTest {

    Customer toddy;
    HashMap<PaymentType, Integer> toddyWallet;

    @Before
    public void before() {
        toddyWallet = new HashMap<PaymentType, Integer>();
        toddyWallet.put(PaymentType.CASH, 200);
        toddyWallet.put(PaymentType.CREDIT_CARD, 2000);
        toddyWallet.put(PaymentType.DEBIT_CARD, 100);
        toddy = new Customer("Toddy", PaymentType.CREDIT_CARD, toddyWallet);
    }

    @Test
    public void hasName() {
        assertEquals("Toddy", toddy.getName());
    }

    @Test
    public void hasPreferredPaymentType () {
        assertEquals(PaymentType.CREDIT_CARD, toddy.getPaymentType());
    }



}
