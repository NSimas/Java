package ReallyBasicJava.ExerciciosSimples;
import java.util.Scanner;

/*
    Faça um programa que calcule o fatorial de
um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 
Como é calculado? 
(5x4x3x2x1)
 */

public class Fatorial {
    public static void fator(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número " +
                "que dejseja obter o fatorial: ");
        int fatorial = leia.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        for (int i = fatorial; i > 0; i --) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}