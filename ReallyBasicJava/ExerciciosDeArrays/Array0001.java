package ReallyBasicJava.ExerciciosDeArrays;

public class Array0001 {
    public static void Array001(String[] args) {

        int[] vetor01 = {-2, 4, 65, 9, 245, -4, 23, 8, 0, 2938};

        int i = 0;

        System.out.println("Vetor: ");

        //passando pelo array unidimensional, mostrando de forma simples
        while (i < (vetor01.length)) {
            System.out.println(vetor01[i]);
            i++;
        }
    }
}
