package com.francisco.estudo.service;


import com.francisco.estudo.domain.PaymentData;
import com.francisco.estudo.port.in.OrderPort;
import com.francisco.estudo.port.out.PaymentPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService implements OrderPort {
    PaymentPort paymentPort;
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void order(PaymentData paymentData) {
       paymentPort =  applicationContext.getBean(paymentData.getPaymentType().getValue(), PaymentPort.class);
       paymentPort.payOrder(paymentData);
    }
}
