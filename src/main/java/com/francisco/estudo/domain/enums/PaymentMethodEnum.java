package com.francisco.estudo.domain.enums;

public enum PaymentMethodEnum {
    MERCADO_PAGO("MercadoPagoPaymentAdapter"),
    PAG_SEGURO("PagSeguroPaymentAdapter");
    private final String value;

    PaymentMethodEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
