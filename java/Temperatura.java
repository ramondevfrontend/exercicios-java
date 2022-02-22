package Exercicio;

public class Temperatura {
    /**
     *  Fahrenheit para Celsius
     */
    public static void main(String[] args) {
        // (ºF - 32) * 5/9 = ºC
        final double Fator = 5 / 9.0; // C
        final double Ajuste = 32; // F

        double fahrenheit = 86;
        double celsius = (fahrenheit - Ajuste) * Fator;
        System.err.println(celsius);

        fahrenheit = 160;
        celsius = (fahrenheit - Ajuste) * Fator;
        System.err.println("A temperatura em Celsius é: " + celsius + ".C");
        
    }
}