package ReallyBasicJava;

import java.util.Scanner;

public class Calculadora0002 {
    public static void c0002 (String[] args){
        Scanner leia = new Scanner(System.in);

        /*
        Faça um Programa que peça 4 notas
        bimestrais e mostre a média.
         */

        float notas = 0f, media = 0f;
        int i = 1;

        while (i < 5) {
            System.out.println("Digite a nota, use vírgula se necessário. Ex: 6,8");
            notas = notas + (leia.nextFloat());

            i++;
        }
        System.out.println("A média do aluno foi: " + notas / (i - 1));
    }
}
