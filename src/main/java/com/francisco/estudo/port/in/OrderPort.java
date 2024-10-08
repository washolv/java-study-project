package com.francisco.estudo.port.in;

import com.francisco.estudo.domain.PaymentData;

public interface OrderPort {
    void order(PaymentData paymentData);
}
