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
    Transaction transaction3;
    Product jellyBeans;
    Customer toddy;
    ArrayList<HashMap<PaymentType, Integer>> toddyWallet;
    HashMap<PaymentType, Integer> cashList;
    HashMap<PaymentType, Integer> creditCardList;
    HashMap<PaymentType, Integer> debitCardList;
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


        toddyWallet.add(cashList);
        toddyWallet.add(creditCardList);
        toddyWallet.add(debitCardList);

        toddy = new Customer("Toddy", toddyWallet);

        shop1 = new ShopAccount("Yan's Sweeties", 6170998, 3000, 100);

        transaction1 = new Transaction(320987, jellyBeans, 30, toddy, "16/07/2017", shop1 );
        transaction2 = new Transaction(320988, jellyBeans, 410, toddy, "16/07/2017", shop1);
        transaction3 = new Transaction(120987, jellyBeans, 30, toddy, "19/07/2017", shop1 );
    }

    @Test
    public void transactionHasBarcodeNumber() {
        assertEquals(320987, transaction1.getTransanctionBarcodeNumber());
    }

    @Test
    public void couldSetTransactionBarcodeNumber() {
        transaction1.setTransanctionBarcodeNumber(6120990);
        assertEquals(6120990, transaction1.getTransanctionBarcodeNumber());
    }

    @Test
    public void transactionHasDate() {
        assertEquals("16/07/2017", transaction1.getTransactionDate());
    }

    @Test
    public void couldSetTransactionDate() {
        transaction1.setTransactionDate("18/07/2017");
        assertEquals("18/07/2017", transaction1.getTransactionDate());
    }

    @Test
    public void couldDoSalesTransaction_shop() {
        transaction1.sales();
        assertEquals(3090, shop1.getSales());
    }

    @Test
    public void couldDoSalesTransaction_customer() {
        transaction1.sales();
        assertEquals(12110, toddy.totalFundAvailable());
    }

    @Test
    public void couldDoSalesTransaction_stock() {
        transaction1.sales();
        assertEquals(370, jellyBeans.getStock());
    }

    @Test
    public void couldNotDoSalesWhenNotEnoughStock_stock() {
        transaction2.sales();
        assertEquals(400, jellyBeans.getStock());
    }

    @Test
    public void couldNotDoSalesWhenNotEnoughStock_customer() {
        transaction2.sales();
        assertEquals(12200, toddy.totalFundAvailable());
    }

    @Test
    public void couldNotDoSalesWhenNotEnoughStock_shop() {
        transaction2.sales();
        assertEquals(3000, shop1.getSales());
    }

    @Test
    public void couldDoRefund_customer() {
        transaction3.refund(PaymentType.CASH, 20);
        assertEquals(290, cashList.get(PaymentType.CASH).intValue());
    }

    @Test
    public void couldDoRefund_shop() {
        transaction3.refund(PaymentType.CASH, 20);
        assertEquals(190, shop1.getRefund());
    }

    @Test
    public void couldDoRefund_stock() {
        transaction3.refund(PaymentType.CASH, 20);
        assertEquals(430, jellyBeans.getStock());
    }


    @Test
    public void couldNotDoRefund_stock() {
        transaction3.refund(PaymentType.BITCOIN, 20);
        assertEquals(400, jellyBeans.getStock());
    }

    @Test
    public void couldNotDoRefund_customer() {
        transaction3.refund(PaymentType.BITCOIN, 20);
        assertEquals(12200, toddy.totalFundAvailable());
    }

    @Test
    public void couldNotDoRefund_shop() {
        transaction3.refund(PaymentType.BITCOIN, 20);
        assertEquals(100, shop1.getRefund());
    }


}
