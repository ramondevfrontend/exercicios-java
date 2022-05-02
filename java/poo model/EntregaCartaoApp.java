import model.Cliente;
import model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000";
        // dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente
        if(cliente.enderecos == null) {
           cliente.enderecos = new ArrayList<Endereco>();
        }



        cliente.adiconaEndereco(endereco);
        System.out.println("Endereco adicionado com sucesso");

    }
}
