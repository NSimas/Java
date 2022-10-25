package ReallyBasicJava.CalculadorasDiversas.Calculadora0005;

public class Pessoa {
        //atributos
    private float peso;
    private float altura;

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    //métodos acessores, são os getters e setters.
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}