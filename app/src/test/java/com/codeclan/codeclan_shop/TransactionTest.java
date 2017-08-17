package com.codeclan.codeclan_shop;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by yanren on 15/08/2017.
 */

public class TransactionTest {

    Transaction transaction1;
    Transaction transaction2;
    Product jellyBeans;
    Customer toddy;
    ArrayList<HashMap<PaymentType, Integer>> toddyWallet;
    HashMap<PaymentType, Integer> cashList;
    HashMap<PaymentType, Integer> creditCardList;
    HashMap<PaymentType, Integer> debitCardList;
    HashMap<PaymentType, Integer> criptoCurrencyList;
    String transactionDate;
    ShopAccount shop1;


    @Before
    public void before(){
        jellyBeans = new Product("Jelly Beans", 456789, 3, "US", 400);

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

        shop1 = new ShopAccount("Yan's Sweeties", 6170998, 3000, 100);

        transaction1 = new Transaction(320987, jellyBeans, 30, toddy, "16/07/2017", shop1 );
        transaction2 = new Transaction(320988, jellyBeans, 410, toddy, "16/07/2017", shop1);
    }

    @Test
    public void couldDoSalesTransaction_1() {
        transaction1.sales();
        assertEquals(3090, shop1.getSales());
    }

    @Test
    public void couldDoSalesTransaction_2() {
        transaction1.sales();
        assertEquals(14110, toddy.totalFundAvailable());
    }

    @Test
    public void couldDoSalesTransaction_3() {
        transaction1.sales();
        assertEquals(370, jellyBeans.getStock());
    }

    @Test
    public void couldNotDoSalesWhenNotEnoughStock_1() {
        transaction2.sales();
        assertEquals(400, jellyBeans.getStock());
    }

    @Test
    public void couldNotDoSalesWhenNotEnoughStock_2() {
        transaction2.sales();
        assertEquals(14200, toddy.totalFundAvailable());
    }

    @Test
    public void couldNotDoSalesWhenNotEnoughStock_3() {
        transaction2.sales();
        assertEquals(3000, shop1.getSales());
    }


}
