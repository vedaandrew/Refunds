package com.va.refunds.service;


import com.va.refunds.models.Refund;
import org.springframework.stereotype.Service;

@Service
public class RefundServiceImpl implements IRefundService {

    @Override
    public String refundOrder(Refund refund) {
        // Get the Order record from order id in refund request
        // check the items to refund in items in order
        // calculate the total amt to refund and check if the total refund amt
        // is equal or less than total paid amt
        // adjust item qty in order and total price in the order
        // remove the item from the order
        // Update the order with the refund and  the send the request to payment service
        // to pay based on payment method
        return null;
    }
}
