package com.codeclan.codeclan_shop;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by yanren on 14/08/2017.
 */

public class CustomerTest {

    Customer toddy;
    ArrayList<HashMap<PaymentType, Integer>> toddyWallet;
    HashMap<PaymentType, Integer> cashList;

    @Before
    public void before() {
        toddyWallet = new ArrayList<HashMap<PaymentType, Integer>>();
        cashList = new HashMap<PaymentType, Integer>();
        cashList.put(PaymentType.CASH, 200);
        HashMap<PaymentType, Integer> creditCardList = new HashMap<PaymentType, Integer>();
        creditCardList.put(PaymentType.MASTER_CREDIT, 5000);
        creditCardList.put(PaymentType.VISA_CREDIT, 4000);
        HashMap<PaymentType, Integer> debitCardList = new HashMap<PaymentType, Integer>();
        debitCardList.put(PaymentType.MASTER_CREDIT, 2000);
        debitCardList.put(PaymentType.VISA_CREDIT, 1000);
        HashMap<PaymentType, Integer> criptoCurrencyList = new HashMap<PaymentType, Integer>();
        criptoCurrencyList.put(PaymentType.BITCOIN, 2000);


        toddyWallet.add(cashList);
        toddyWallet.add(debitCardList);
        toddyWallet.add(creditCardList);
        toddyWallet.add(criptoCurrencyList);

        toddy = new Customer("Toddy", toddyWallet);
    }

    @Test
    public void hasName() {
        assertEquals("Toddy", toddy.getName());
    }

    @Test
    public void couldSetName() {
        toddy.setName("Barry");
        assertEquals("Barry", toddy.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(toddyWallet, toddy.getWallet());
    }

    @Test
    public void couldSetNewWallet() {
        ArrayList<HashMap<PaymentType, Integer>> toddyNewWallet = new ArrayList<HashMap<PaymentType, Integer>>();
        HashMap<PaymentType, Integer> cashList = new HashMap<PaymentType, Integer>();
        cashList.put(PaymentType.CASH, 300);
        HashMap<PaymentType, Integer> creditCardList = new HashMap<PaymentType, Integer>();
        creditCardList.put(PaymentType.MASTER_CREDIT, 5000);
        creditCardList.put(PaymentType.VISA_CREDIT, 4000);
        HashMap<PaymentType, Integer> debitCardList = new HashMap<PaymentType, Integer>();
        debitCardList.put(PaymentType.VISA_DEBIT, 3000);
        debitCardList.put(PaymentType.MASTER_DEBIT, 1000);
        HashMap<PaymentType, Integer> criptoCurrencyList = new HashMap<PaymentType, Integer>();
        criptoCurrencyList.put(PaymentType.BITCOIN, 2000);

        toddyNewWallet.add(cashList);
        toddyNewWallet.add(debitCardList);
        toddyNewWallet.add(creditCardList);
        toddyNewWallet.add(criptoCurrencyList);

        toddy.setWallet(toddyNewWallet);

        assertEquals(300, toddy.getWallet().get(0).get(PaymentType.CASH).intValue());
    }


    @Test
    public void hasPreferredPaymentType() {
        assertEquals(cashList, toddy.getPreferredPayment());
    }


    @Test
    public void couldSumAvailableFund() {
        assertEquals(14200, toddy.totalFundAvailable());
    }



}
