package com.francisco.estudo.controller;

import com.francisco.estudo.domain.PaymentData;
import com.francisco.estudo.port.in.OrderPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderPort orderPort;

    @PostMapping
    public void orderProduct(@RequestBody PaymentData paymentData) {
        this.orderPort.order(paymentData);
    }
}
