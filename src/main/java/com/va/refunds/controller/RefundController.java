package com.va.refunds.controller;


import com.va.refunds.models.Order;
import com.va.refunds.models.Refund;
import com.va.refunds.service.IRefundService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = {"/api/v1/refund"})
public class RefundController {

    private static final Logger logger = LoggerFactory.getLogger(RefundController.class);

    @Autowired
    private IRefundService refundService;

    @ApiOperation(value = "Api for refund order")
    @PutMapping(path = "/refund", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> loadCoins(@RequestBody Refund refund) throws Exception {
        // Get the order from order id in the Refund request
        // Check if order is in PARTIAL or COMPLETED Status otherwise throw exception
        String status = refundService.refundOrder(refund);
        return new ResponseEntity<>("Successfully Updated", HttpStatus.OK);
    }


}
