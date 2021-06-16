package com.va.refunds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefundApp {

    private static final Logger logger = LoggerFactory.getLogger(RefundApp.class);

    public static void main(String[] arg) {
        SpringApplication.run(RefundApp.class, arg);
    }

}
