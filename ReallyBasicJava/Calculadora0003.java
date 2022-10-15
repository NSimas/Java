package ReallyBasicJava;

public class Calculadora0003 {
    public static void calc0003(String[] args) {
        Scanner leia = new Scanner(System.in);

        /*
        Faça um algorítmo que receba o preço de
        custo e o preço de venda de 40 produtos,
        mostre se houve lucro, prejuízo ou
        empate para cada um e informe o valor
        de custo, de venda e a média de preço
        de custo e também a média do preços de
        venda deles.
         */

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0
        for (; i <40; i++) {

            System.out.println("Digite o nome do item:");
            nomeProduto = leia.nextLine();

            System.out.println("Digite o preço de custo do item:");
            precoCusto = leia.nextFloat();

            System.out.println("Digite o preço de venda do item:");
            precoVenda = leia.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Não há lucro ou prejuízo.");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Houve prejuízo.");
                } else {
                    System.out.println("Houve lucro.");
                }
            }

            System.out.println(nomeProduto + ", preço de custo: "
                    + precoCusto + ", preço de venda: " + precoVenda);
        }

        System.out.println("A média do preço de custo foi: " + (totalCusto/i));
        System.out.println("A média do preço de venda foi: " + (precoVenda/i));
    }

}
