package com.exchange.currency.object;

import java.sql.Timestamp;
import java.util.Date;

public class RecordExchange {
    private String monto;
    private String original_currency;
    private String currencyToChange;
    private final Timestamp date;
    private String status;

    public RecordExchange(String original_currency, String currencyToChange) {
        this.date = new Timestamp(new Date().getTime());
        this.original_currency = original_currency;
        this.currencyToChange = currencyToChange;

    }


    public Timestamp getDate() {
        return date;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getOriginal_currency() {
        return original_currency;
    }

    public void setOriginal_currency(String original_currency) {
        this.original_currency = original_currency;
    }

    public String getcurrencyToChange() {
        return currencyToChange;
    }

    public void setcurrencyToChange(String currencyToChange) {
        this.currencyToChange = currencyToChange;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-8s | %-8s | %-30s | %-10s |",
                monto,
                original_currency,
                currencyToChange,
                date,
                status);
    }
}
