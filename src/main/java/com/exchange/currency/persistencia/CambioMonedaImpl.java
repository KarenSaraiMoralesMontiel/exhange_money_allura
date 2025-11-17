package com.exchange.currency.persistencia;

import com.exchange.currency.object.CambioMoneda;
import com.exchange.currency.utils.Connection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class CambioMonedaImpl {
    private String currency;
    private String currencyToChange;
    public CambioMonedaImpl() {
    }

    public CambioMonedaImpl(String currency, String currencyToChange) {
        this.currency = currency;
        this.currencyToChange = currencyToChange;
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

    public Double getCambioMoneda() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            Connection cn = new Connection();
            HttpRequest request = cn.getExchangeHttpRequest(this.getCurrency());

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            CambioMoneda egg = gson.fromJson(response.body(), CambioMoneda.class);
            Double rate = egg.getConversion_rates().get(this.getCurrencyToChange());
            return rate;

        } catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return 0.0;
    }



}
