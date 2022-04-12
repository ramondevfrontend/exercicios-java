package equalshashCode;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){

        List<Carro> listacarros = new ArrayList<>();

        listacarros.add(new Carro("Ford"));
        listacarros.add(new Carro("Chevrolet"));
        listacarros.add(new Carro("Volkswagen"));

        System.out.println(listacarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));
    }
}
