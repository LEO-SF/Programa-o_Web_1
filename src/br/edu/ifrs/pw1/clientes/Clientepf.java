package br.edu.ifrs.pw1.clientes;

import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.List;

public class Clientepf extends Cliente {
    private String nome;
    private Cpf cpf;

    @Override
    public String toString() {
        return "Clientepf{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    public Clientepf(){}

    public Clientepf(String telefone, List<Endereco> enderecos, String nome, Cpf cpf) {
        super(telefone, enderecos);
        this.nome = nome;
        this.cpf = cpf;
    }
}
