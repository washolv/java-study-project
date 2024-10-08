package com.francisco.estudo.adapter;

import com.francisco.estudo.domain.PaymentData;
import com.francisco.estudo.port.out.PaymentPort;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Service("MercadoPagoPaymentAdapter")
public class MercadoPagoPaymentAdapter implements PaymentPort {
    private static final Logger logger = LoggerFactory.getLogger(PagSeguroPaymentAdapter.class);

    @Override
    public void payOrder(PaymentData paymentData) {
        logger.info("Mercado Pago payment");
    }

    @Override
    public void paymentOrder(PaymentData paymentData) {
        logger.info("Deprecated method");
    }
}
