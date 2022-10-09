import java.util.Scanner;

public class NomeIdade0001 {
    public static void ni0001(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String nome;
        int idade = 0;

        while(true) {
            System.out.println("Nome: ");
            nome = Scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = Scan.nextInt();

        }

        System.out.println(nome);
        System.out.println(idade);
    }
}