package com.va.refunds.models;

import java.util.List;

public class Order {

    private String id;
    private List<Item> items;
    private List<Refund> refunds;
    private String status;
    private String paymentRefId;
    private double shippingCharge;
    private double totalAmt;
    private double totalAmtRefund;
    private Customer customer;

    // Add Getters and Setters
}
