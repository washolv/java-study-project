package com.francisco.estudo.domain;

import com.francisco.estudo.domain.enums.PaymentMethodEnum;
import lombok.Data;

@Data
public class PaymentData {
    private int id;
    private PaymentMethodEnum paymentType;
}
