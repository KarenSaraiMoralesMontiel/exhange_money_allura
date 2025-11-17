package com.exchange.currency.object;


import java.util.Currency;
import java.util.Map;

public class CambioMoneda {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public CambioMoneda() {
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }
}
