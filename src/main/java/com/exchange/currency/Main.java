package com.exchange.currency;
import com.exchange.currency.persistencia.CambioMonedaImpl;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String option;
        String menu = """
                
                Sea bienvenido/a al Conversor de Moneda =
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:""";

        do {
            System.out.println(menu);
            Scanner s = new Scanner(System.in);
            option = s.nextLine();
            switch (option) {
                case "1" : {
                    try {
                    System.out.println("Entre el monto para cambiar");
                    Double monto = Double.parseDouble(s.nextLine());
                    CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl("USD", "ARS");
                    Double total = cambioMonedaImpl.getCambioMoneda() * monto;
                    String truncated_total = String.format("%.4f", total);
                    System.out.println("Total: " + truncated_total + " " + cambioMonedaImpl.getCurrencyToChange()); }
                    catch (NumberFormatException n) {
                        System.out.println("Entre un monto válido");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case "2" : {
                    try {
                    System.out.println("Entre el monto para cambiar");
                    Double monto = Double.parseDouble(s.nextLine());
                    CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl("ARS", "USD");

                    Double total = cambioMonedaImpl.getCambioMoneda() * monto;
                    String truncated_total = String.format("%.4f", total);
                    System.out.println("Total: " + truncated_total + " " + cambioMonedaImpl.getCurrencyToChange()); }
                    catch (NumberFormatException n) {
                        System.out.println("Entre un monto válido");
                    }
                    catch (Exception e) {
                        System.out.println(e);

                    }
                    break;
                }
                case "3" : {
                    try {
                    System.out.println("Entre el monto para cambiar");
                    Double monto = Double.parseDouble(s.nextLine());
                    CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl("USD", "BRL");

                    Double total = cambioMonedaImpl.getCambioMoneda() * monto;
                    String truncated_total = String.format("%.4f", total);
                    System.out.println("Total: " + truncated_total + " " + cambioMonedaImpl.getCurrencyToChange());}
                    catch (NumberFormatException n) {
                        System.out.println("Entre un monto válido");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case "4" : {
                    try {
                    System.out.println("Entre el monto para cambiar");
                    Double monto = Double.parseDouble(s.nextLine());
                    CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl("BRL", "USD");

                    Double total = cambioMonedaImpl.getCambioMoneda() * monto;
                    String truncated_total = String.format("%.4f", total);
                    System.out.println("Total: " + truncated_total + " " + cambioMonedaImpl.getCurrencyToChange());}
                    catch (NumberFormatException n) {
                        System.out.println("Entre un monto válido");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }

                    break;
                }
                case "5" : {
                    try {
                    System.out.println("Entre el monto para cambiar");
                    Double monto = Double.parseDouble(s.nextLine());
                    CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl("USD", "COP");
                    Double total = cambioMonedaImpl.getCambioMoneda() * monto;
                    String truncated_total = String.format("%.4f", total);
                    System.out.println("Total: " + truncated_total + " " + cambioMonedaImpl.getCurrencyToChange()); }
                    catch (NumberFormatException n) {
                        System.out.println("Entre un monto válido");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case "6" : {
                    try {
                    System.out.println("Entre el monto para cambiar");
                    Double monto = Double.parseDouble(s.nextLine());
                    CambioMonedaImpl cambioMonedaImpl = new CambioMonedaImpl("COP", "USD");
                    Double total = cambioMonedaImpl.getCambioMoneda() * monto;
                    System.out.println("Total: " + total + " " + cambioMonedaImpl.getCurrencyToChange());}
                    catch (NumberFormatException n) {
                        System.out.println("Entre un monto válido");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case "7":
                    System.out.println("Bye bye!");
                    break;
                default: {
                    System.out.println("Seleccione una opción válida");
                    System.out.println("Presione enter para continuar...");
                    s.nextLine();
                }
            }
        } while (!option.equals("7"));
    }

}