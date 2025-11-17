package com.exchange.currency;
import com.exchange.currency.object.RecordExchange;
import com.exchange.currency.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String option;
        List<RecordExchange> recordExchangeList = new ArrayList<>();
        String menu = """
                
                Sea bienvenido/a al Conversor de Moneda =
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Record
                8) Salir
                Elija una opción válida:""";

        do {
            System.out.println(menu);
            Scanner s = new Scanner(System.in);
            option = s.nextLine();
            switch (option) {
                case "1" : {
                    String currency = "USD";
                    String currencyToChange = "ARS";
                    CurrencyExchangeUtil currencyExchangeUtil = new CurrencyExchangeUtil(currency, currencyToChange);
                    System.out.println("Entre el monto para cambiar");
                    String montoS = s.nextLine();
                    currencyExchangeUtil.getTotalExchange(montoS);
                    RecordExchange recordExchange = currencyExchangeUtil.getRecordExchange();
                    recordExchangeList.add(recordExchange);
                    break;
                }
                case "2" : {
                    String currency = "ARS";
                    String currencyToChange = "USD";
                    CurrencyExchangeUtil currencyExchangeUtil = new CurrencyExchangeUtil(currency, currencyToChange);
                    System.out.println("Entre el monto para cambiar");
                    String montoS = s.nextLine();
                    currencyExchangeUtil.getTotalExchange(montoS);
                    RecordExchange recordExchange = currencyExchangeUtil.getRecordExchange();
                    recordExchangeList.add(recordExchange);
                    break;
                }
                case "3" : {
                    String currency = "USD";
                    String currencyToChange = "BRL";
                    CurrencyExchangeUtil currencyExchangeUtil = new CurrencyExchangeUtil(currency, currencyToChange);
                    System.out.println("Entre el monto para cambiar");
                    String montoS = s.nextLine();
                    currencyExchangeUtil.getTotalExchange(montoS);
                    RecordExchange recordExchange = currencyExchangeUtil.getRecordExchange();
                    recordExchangeList.add(recordExchange);
                    break;
                }
                case "4" : {
                    String currency = "BRL";
                    String currencyToChange = "USD";
                    CurrencyExchangeUtil currencyExchangeUtil = new CurrencyExchangeUtil(currency, currencyToChange);
                    System.out.println("Entre el monto para cambiar");
                    String montoS = s.nextLine();
                    currencyExchangeUtil.getTotalExchange(montoS);
                    RecordExchange recordExchange = currencyExchangeUtil.getRecordExchange();
                    recordExchangeList.add(recordExchange);
                    break;
                }
                case "5" : {
                    String currency = "USD";
                    String currencyToChange = "COP";
                    CurrencyExchangeUtil currencyExchangeUtil = new CurrencyExchangeUtil(currency, currencyToChange);
                    System.out.println("Entre el monto para cambiar");
                    String montoS = s.nextLine();
                    currencyExchangeUtil.getTotalExchange(montoS);
                    RecordExchange recordExchange = currencyExchangeUtil.getRecordExchange();
                    recordExchangeList.add(recordExchange);
                    break;
                }
                case "6" : {
                    String currency = "COP";
                    String currencyToChange = "USD";
                    CurrencyExchangeUtil currencyExchangeUtil = new CurrencyExchangeUtil(currency, currencyToChange);
                    System.out.println("Entre el monto para cambiar");
                    String montoS = s.nextLine();
                    currencyExchangeUtil.getTotalExchange(montoS);
                    RecordExchange recordExchange = currencyExchangeUtil.getRecordExchange();
                    recordExchangeList.add(recordExchange);
                    break;
                }
                case "7":
                    System.out.format("| %3s | %-10s | %-5s | %-7s | %-30s | %-10s |",
                            "NO.",
                            "MONTO",
                            "ORIGINAL",
                            "CAMBIO",
                            "TIMESTAMP",
                            "STATUS");
                    System.out.println();
                    for (int i = 0; i < recordExchangeList.size(); i++) {
                        System.out.printf("| %-3d %s%n", (i+1), recordExchangeList.get(i).toString());
                    }
                    System.out.println("Presione enter para continuar...");
                    s.nextLine();
                    break;
                case "8":
                    System.out.println("Bye bye!");
                    break;
                default: {
                    System.out.println("Seleccione una opción válida");
                    System.out.println("Presione enter para continuar...");
                    s.nextLine();
                }
            }
        } while (!option.equals("8"));
    }

}