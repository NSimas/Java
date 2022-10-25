package ReallyBasicJava.CalculadorasDiversas.Descontos0001;
/*
    A concessionária de veículos "Carango Velho" está vendendo
os seus veículos com desconto. Faça um algorítmo que calcule e
exiba o valor do desconto e o valor a ser pago pelo cliente
de vários carros. O desconto deverá ser calculado de acordo
com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%.
O sistema deverá perguntar se deseja continuar calculando o
desconto até que a resposta seja: "(N) Não". Informar o total
de carros com ano até 2000 e o total de carros no geral.
 */

import java.util.Scanner;

public class Descontos0001 {
    public static void Descontos(String[] args) {

        Scanner leia = new Scanner(System.in);

        int anoFabricacao = 0;
        double valorVeiculo = 0.0d;
        double valorVeiculoComDesconto = 0.0d;

        int totalCarros = 0;
        int totalCarrosAntigos = 0;

        Character repetir = 's';

        while (repetir == 's' || repetir == 'S') {

            System.out.println("Digite o ano de fabricação do veículo:");
            anoFabricacao = leia.nextInt();

            System.out.println("Digite o valor do veículo:");
            valorVeiculo = leia.nextDouble();

            if(anoFabricacao <= 2000) {
                //12%
                valorVeiculoComDesconto = valorVeiculo * 0.88;

                totalCarrosAntigos++;
            } else {
                //7%
                valorVeiculoComDesconto = valorVeiculo * 0.93;
            }
            totalCarros++;

            System.out.println("O valor do desconto foi de: R$ "
                    + (valorVeiculo - valorVeiculoComDesconto));
            System.out.println("O valor a pagar é de: R$ "
                    + valorVeiculoComDesconto);

            System.out.println("Deseja realizar outro cadastro: S - sim ou N - não");
            repetir = leia.next().charAt(0);
        }
        System.out.println("O total de carros antigos foi: "
                + totalCarrosAntigos);
        System.out.println("O total geral de carro foi: "
                + totalCarros);
    }
}