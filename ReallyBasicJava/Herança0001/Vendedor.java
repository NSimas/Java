package ReallyBasicJava.Herança0001;

import java.util.Date;

public class Vendedor extends Funcionario {
    
    private float comissao;
    private int totalItensVendidos;

    public Vendedor() {
        super();
    }

    public float calcularPagamento() {
        return super.getSalario() + (this.comissao * totalItensVendidos);
    }

    //setters
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = comissao;
    }

    //getters
    public float getComissao() {
        return comissao;
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }
}
