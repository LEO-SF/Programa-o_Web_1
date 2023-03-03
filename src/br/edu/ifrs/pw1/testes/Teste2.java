package br.edu.ifrs.pw1.testes;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.clientes.Clientepf;
import br.edu.ifrs.pw1.clientes.Cliente;
import java.util.List;

public class Teste2 {
    public static void main(String[] args){
        Cliente cli1 = new Cliente();
        System.out.println(cli1);
        System.out.println(cli1.toString());

        List<Endereco> enderecos = new Arraylist<>();
        Endereco end = new Endereco("logradouro2", "complemento2", 9078656);
        enderecos.add(end);
        enderecos.add(new Endereco());
        enderecos.add(new Endereco("logradouro1", "complemento1", 9078656));
        Cliente cli2 = new Cliente("51445566", enderecos);
        System.out.println(cli2);

    }
}
