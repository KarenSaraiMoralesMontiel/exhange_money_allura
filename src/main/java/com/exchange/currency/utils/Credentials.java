package com.exchange.currency.utils;

public class Credentials {
    public static final String exchange_URL = """
            https://v6.exchangerate-api.com/v6/""" + System.getenv("API_KEY")
            + "/latest/";

}
