package ReallyBasicJava.Herança0001;

public class Main {
    
    Vendedor v = new Vendedor();
    v.setNome("Zuleico");
    v.setSalario(1250.0f);
    v.setCpf("123.123.123.12");
    v.setDataNascimento(new Date());
    v.setComissao(8.5f);
    v.setTotalItensVendidos(12);

    System.out.println("O vendedor " + v.getNome + 
    " vai receber o pagamento no total de R$ " + v.calcularPagamento);
    
    Motorista m = new Motorista();

}
