package Exercicio;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5; // Variável foi declarada e Inicializada na mesma linha
        System.err.println(a);

        a = 12.9;
        System.err.println(a);

        var b = 4.5; // É possivel apenas declarar variável número, náo pode ser texto (string), texto apenas em strings.
        System.err.println(b);

        var c = "Texto";
        System.err.println(c);
        c = "Outro texto";
        System.err.println(c);

        double d; // Variável foi declarada
        d = 12.565; // Variável foi inicializada
        System.err.println(d); // Variável usada

        var i = 89;
        System.err.println(i);

        var y = "Sou o Ramon dos Santos";
        System.err.println(y);
    }
}
