package ReallyBasicJava.ExerciciosDeArrays;

import java.util.Random;

/*
    Gere e imprima uma matriz M 4x4 com valores 
aleatórios entre 0 e 20.
*/

public class ArrayRandom0002 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int [] [] matrix = new int [4] [4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rnd.nextInt(20);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matrix) {
            for (int[] coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}