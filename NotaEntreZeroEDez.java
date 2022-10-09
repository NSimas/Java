import java.util.Scanner;

/* Pedir uma nota entrer 0 e 10.
Se for um valor inválido, apresentar mensagem.
 */

public class NotaEntreZeroEDez {
    public static void NotaEntreZeroEDez0001(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota<0 | nota>10) {
            System.out.println("Nota inválida! Digite novamente!");
            nota = scan.nextInt();
        }
    }
}