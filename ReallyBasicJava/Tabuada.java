package ReallyBasicJava;
import java.util.Scanner;

/*
    Desenvolva um gerador de tabuada que seja capaz
de gerar a tabuada de qualquer número inteiro entre
1 e 10. O usuário deve informar de qual número ele
deseja ver a tabuada.
    A saída deve ficar cfe o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class Tabuada {
    public static void Tabuada0001(String[] args) {
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