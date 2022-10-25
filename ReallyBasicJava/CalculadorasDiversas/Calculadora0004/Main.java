package ReallyBasicJava.CalculadorasDiversas.Calculadora0004;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa objPessoa = new Pessoa();
        float imc;

        Scanner leia = Scanner(System.in);

        System.out.println("Digite o peso, use ponto se precisar.");
        objPessoa.peso = leia.nextFloat();
        System.out.println("Digite a altura.");
        objPessoa.altura = leia.nextFloat();

        System.out.println("IMC = " + objPessoa.calcularIMC());
    }
}
