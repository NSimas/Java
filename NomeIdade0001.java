import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = Scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = Scan.nextInt();

        }
    }
}