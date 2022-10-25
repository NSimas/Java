package ReallyBasicJava.ExerciciosDeArrays;
/*
Faça um Programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class Consooantes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsooantes = 0;

        int i = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = leia.next().charAt(0);

            if ( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                    consoantes[i] = letra;
                    qtdConsooantes++;
                }
            i++;
        } while (i < consoantes.length);

        System.out.println("As consoantes são: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("A quantidade de consooantes " +
        "digitadas foi: " + qtdConsooantes);
        System.out.println(consoantes.length);
}
