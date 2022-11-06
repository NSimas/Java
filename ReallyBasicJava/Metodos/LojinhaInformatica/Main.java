package ReallyBasicJava.Metodos.LojinhaInformatica;

import java.security.cert.X509CRLSelector;

public class Main {
    
    Invoice i = new Invoice(1, "mousepad", 10, 48.0f);
    System.out.println("Valor total = " + i+getInvoiceAmount());

    Invoice i = new Invoice(1, "mouse", 15, -6f);
    System.out.println("Valor total = " + i+getInvoiceAmount());

    Invoice i = new Invoice(1, "mousepad", -12, 48.0f);
    System.out.println("Valor total = " + i+getInvoiceAmount());
}