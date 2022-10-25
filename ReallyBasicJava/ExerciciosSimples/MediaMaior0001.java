package ReallyBasicJava.ExerciciosSimples;


import java.util.Scanner;

/* Pedir que o usuário insira 5 números.
Mostrar qual dos números é o maior e
mostrar qual a média dos números.
 */

public class MediaMaior0001 {
    public static void mm0001(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int i = 0;
        int soma = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) {
                maior = numero;
            }

            i = i+1;
        } while (i < 5);

        soma = soma / 5;

        System.out.println("Maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados é: " + soma);
    }
}