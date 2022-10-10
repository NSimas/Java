package ReallyBasicJava;

import java.util.Scanner;

public class ComandosLeituraGravacao0001 {
    public static void leituraGravacao(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /* Comandos de leitura e gravação
         */

        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();

        //lê toda a próxima linha digitada
        String nome = leitor.nextLine();
        //lê a próxima palavra digitada
        String primeiroNome = leitor.next();

        System.out.println("Texto que deixa o cursor no fim da próxima linha");
        System.out.print("Texto que deixa o cursor no fim da mesma linha");
    }
}
