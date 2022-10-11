package ReallyBasicJava;

import java.util.Scanner;

public class Calculadora0001 {
    public static void c0001(String[] args) {
        Scanner leia = new Scanner(System.in);

        /* Faça um Programa que peça dois
        números e imprima a soma, subtração,
        multiplicação e divisão destes.
         */

        float numero1 = 0f, numero2 = 0f;

        System.out.println("Digite o primeiro número, use ponto. Ex: 2.8");
        numero1 = leia.nextFloat();

        System.out.println("Digite outro número, use ponto. Ex: 3.8");
        numero2 = leia.nextFloat();

        System.out.println("A soma dos números é " + numero1 + numero2);
        System.out.println("A subtração entre os números é " + numero1 - numero2);
        System.out.println("A multiplicação dos números é " + numero1 * numero2);
        System.out.println("A divisão dos números é " + numero1 / numero2);
    }    
}
