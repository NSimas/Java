package ReallyBasicJava.Calculadora0005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa objPessoa = new Pessoa(70.0f, 1.70f);
            
        Scanner leia = Scanner(System.in);

        System.out.println("Digite o peso, use vírgula se precisar.");
        objPessoa.setPeso(leia.nextFloat());
        System.out.println("Digite a altura, use vírgula, se necessário.");
        objPessoa.setAltura(leia.nextFloat());

        System.out.println("IMC = " + objPessoa.calcularIMC());
    }
}