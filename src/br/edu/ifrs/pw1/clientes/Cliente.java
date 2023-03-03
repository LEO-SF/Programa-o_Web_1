package br.edu.ifrs.pw1.clientes;
import java.util.List;
import br.edu.ifrs.pw1.contatos.Endereco;

public class Cliente {
    private String telefone;
    private List<Endereco> enderecos;

    @Override
    public String toString() {
        return "Cliente{" +
                "telefone='" + telefone + '\'' +
                ", enderecos=" + enderecos +
                '}';
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Cliente(){}
    public Cliente(String telefone, List<Endereco> enderecos) {
        this.telefone = telefone;
        this.enderecos = enderecos;
    }
}
