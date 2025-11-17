package com.exchange.currency.utils;

import com.exchange.currency.object.RecordExchange;
import com.exchange.currency.persistencia.CambioMonedaImpl;

public class CurrencyExchangeUtil {
   private String currency;
   private String currencyToChange;
   private final RecordExchange recordExchange;

    public CurrencyExchangeUtil(String currency, String currencyToChange) {
        this.currency = currency;
        this.currencyToChange = currencyToChange;
        this.recordExchange = new RecordExchange(currency, currencyToChange);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyToChange() {
        return currencyToChange;
    }

    public void setCurrencyToChange(String currencyToChange) {
        this.currencyToChange = currencyToChange;
    }

    public RecordExchange getRecordExchange() {
        return recordExchange;
    }

    public void getTotalExchange(String montoS) {
        String status = "Fallido";
        try {
            Double monto = Double.parseDouble(montoS);
            CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl(this.currency, this.currencyToChange);
            Double total = cambioMonedaImpl.getCambioMoneda() * monto;
            String truncated_total = String.format("%.4f", total);
            System.out.println("Total: " + truncated_total + " " + cambioMonedaImpl.getCurrencyToChange());
            status = "Exitoso";
        }
        catch (NumberFormatException n) {
            System.out.println("Entre un monto válido");
            montoS = null;
        }
        catch (Exception e) {
            montoS = null;
            System.out.println(e);
        }
        finally {
            this.recordExchange.setMonto(montoS);
            this.recordExchange.setStatus(status);
        }
    }

}
