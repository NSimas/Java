package ReallyBasicJava.ExerciciosDeArrays;

import java.util.Random;

/*
    Faça um Programa que leia 20 números inteiros
aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final mostre os números e seus sucessores.
*/

public class VetorRandom0001 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosRandom = new int[20];

        for (int i = 0; i < numerosRandom.length; i++) {
            int num = random.nextInt(100);
            numerosRandom[i] = num;
        }

        System.out.println("\nNúmeros aleatórios no vetor:");
        for (int numero : numerosRandom) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores aos números do vetor:");
        for (int numero : numerosRandom) {
            System.out.print((numero +1) + " ");
        }
    }
}