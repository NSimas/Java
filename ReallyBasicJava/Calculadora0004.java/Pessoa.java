package ReallyBasicJava.Calculadora0004.java;

public class Pessoa {

    //atributos
    float peso;
    float altura;

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
}
