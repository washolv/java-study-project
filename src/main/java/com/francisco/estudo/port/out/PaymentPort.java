package com.francisco.estudo.port.out;


import com.francisco.estudo.domain.PaymentData;

public interface PaymentPort {
    void payOrder(PaymentData paymentData);
    @Deprecated
    void paymentOrder(PaymentData paymentData);
}
