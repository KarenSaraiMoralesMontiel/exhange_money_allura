package com.exchange.currency.utils;

import java.net.URI;
import java.net.http.HttpRequest;

import static com.exchange.currency.utils.Credentials.exchange_URL;

public class Connection {


    public HttpRequest getExchangeHttpRequest(String moneda_original) {
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(exchange_URL + moneda_original))
                .GET()
                .build();
        return solicitud;
    }


}
