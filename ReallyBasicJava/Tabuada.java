package ReallyBasicJava;
import java.util.Scanner;

public class Tabuada {
    public static void Tabuada(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("De qual número," +
        " entre 0 e 10 você quer ver a tabuada? ");
        int tabuada = leia.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
        System.out.println(tabuada + " X " + i + " = "
            + (tabuada * i));
        }
    }
}