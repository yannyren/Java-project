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
    HashMap<PaymentType, Integer> creditCardList;
    HashMap<PaymentType, Integer> debitCardList;
    HashMap<PaymentType, Integer> criptoCurrencyList;

    @Before
    public void before() {
        toddyWallet = new ArrayList<HashMap<PaymentType, Integer>>();
        cashList = new HashMap<PaymentType, Integer>();
        cashList.put(PaymentType.CASH, 200);
        creditCardList = new HashMap<PaymentType, Integer>();
        creditCardList.put(PaymentType.MASTER_CREDIT, 5000);
        creditCardList.put(PaymentType.VISA_CREDIT, 4000);
        debitCardList = new HashMap<PaymentType, Integer>();
        debitCardList.put(PaymentType.MASTER_DEBIT, 2000);
        debitCardList.put(PaymentType.VISA_DEBIT, 1000);
        criptoCurrencyList = new HashMap<PaymentType, Integer>();
        criptoCurrencyList.put(PaymentType.BITCOIN, 2000);


        toddyWallet.add(cashList);
        toddyWallet.add(creditCardList);
        toddyWallet.add(debitCardList);
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

    @Test
    public void couldPayForShopping_1() {
        int billAmount = 10200;
        toddy.payForShopping(10200);
        assertEquals(0, toddyWallet.get(0).get(PaymentType.CASH).intValue());
    }

    @Test
    public void couldPayForShopping_2() {
        int billAmount = 10200;
        toddy.payForShopping(10200);
        assertEquals(0, toddyWallet.get(1).get(PaymentType.MASTER_CREDIT).intValue());
    }

    @Test
    public void couldPayForShopping_3() {
        int billAmount = 10200;
        toddy.payForShopping(10200);
        assertEquals(0, toddyWallet.get(1).get(PaymentType.VISA_CREDIT).intValue());
    }

    @Test
    public void couldPayForShopping_4() {
        int billAmount = 10200;
        toddy.payForShopping(10200);
        assertEquals(0, toddyWallet.get(2).get(PaymentType.VISA_DEBIT).intValue());
    }

    @Test
    public void couldPayForShopping_5() {
        int billAmount = 10200;
        toddy.payForShopping(10200);
        assertEquals(2000, toddyWallet.get(2).get(PaymentType.MASTER_DEBIT).intValue());
    }



}
