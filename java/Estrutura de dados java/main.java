package BootcampSportheca;

/**
 * Estrutura de dados em Java
 */

public class main {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA=" + intA + " intB=" + intB);

        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);


        Meuobj objA = new Meuobj(4);
        Meuobj objB = objA;
        System.out.println("objA=" + objA + " objB=" + objB);
    }
}
