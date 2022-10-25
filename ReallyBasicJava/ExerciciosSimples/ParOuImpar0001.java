package ReallyBasicJava.ExerciciosSimples;
import java.util.Scanner;

/* Crie um programa que peça X números
inteiros, que calcule e mostre a
quantidade de números pares e a
quantidade de números ímpares.
 */

public class ParOuImpar0001 {
    public static void ParOuImpar1 (String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros = 0;
        int numero = 0;

        System.out.println("Quantos números serão digitados? ");
        qtdNumeros = scan.nextInt();



        int i = 0, par = 0, impar = 0;
        do {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            i++;
        } while (i < qtdNumeros);
        System.out.println("Você digitou " + par + " números pares.");
        System.out.println("Você digitou " + impar + " números ímpares.");
    }
}