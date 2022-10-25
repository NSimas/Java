package ReallyBasicJava.ExerciciosDeArrays;

public class ArrayDeTrasPraFrente {
    public static void main(String[] args) {

        int[] vetor01 = {-2, 4, 65, 9, 245, -4, 23, 8, 0, 2938};

        int i = 0;

        System.out.println("Vetor: ");

        //passeando pelo array com for, invertido

        for (int i = (vetor01.length -1); i >= 0; i --) {
            System.out.print(vetor01[i] + " ");
        }
    }
}
