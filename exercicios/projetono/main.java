package projetono;

/**
 * no1 puxando o no2
 * no2 puxando o no3
 * no3 puxando o no4
 * no4 puxando para null (...) - Caso não houver outro.
 */

public class main {
    public static void main(String[] args) {

        no no1 = new no( "conteúdo no no1");

        no no2 = new no( "conteúdo no no2");
        no1.setProximono(no2);

        no no3 = new no( "conteúdo no no3");
        no2.setProximono(no3);

        no no4 = new no("conteúdo no no4");
        no3.setProximono(no4);

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no1.getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono().getProximono());

        // no1->no2->no3->no4->null
    }
}
