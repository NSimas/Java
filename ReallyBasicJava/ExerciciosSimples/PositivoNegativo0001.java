package ReallyBasicJava.ExerciciosSimples;

import java.util.Scanner;

public class PositivoNegativo0001 {
    public static void positivonegativo(String[] args) {
        Scanner leia = new Scanner(System.in);

        /*
        Faça um Programa que receba N números e que
        mostre se é positivo, negativo ou zero.
         */

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' ||
                desejaContinuar == 's') {

            System.out.println("Digite um número inteiro:");
            int numero = leia.nextInt();

            if (numero == 0) {
                System.out.println("O número é zero!");
            } else {
                if (numero > 0) {
                    System.out.println("O número é positivo!");
                } else {
                    System.out.println("O número é negativo!");
                }
            }
        }

        System.out.println("Deseja continuar? s/n");
        desejaContinuar = leia.next().charAt(0);



    }
}
}
