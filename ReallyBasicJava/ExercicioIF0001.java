package ReallyBasicJava;

public class ExercicioIF0001 {
    public static void if0001(String[] args) {
        Scanner leia = new Scanner(System.in);

        /*
        Faça um Programa que receba um número e
        diga se ele está entre 100 e 200.
         */

        int numero;

        System.out.println("Digite um número inteiro:");
        numero = leia.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O núemro está na faixa de 100 a 200!");
        } else {
            System.out.println("O número não está na faixa de 100 a 200!");
        }
    }
}