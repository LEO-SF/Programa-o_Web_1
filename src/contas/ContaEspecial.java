package contas;
import clientes.Cliente;
import java.util.List;
import agencias.Agencia;

public class ContaEspecial extends Conta {

    private double limite;
    private List<Cliente> clientes;
    public ContaEspecial(double saldo, long numero, Agencia agencia, double limite, List<Cliente> clientes) {
        super(saldo, numero, agencia);
        this.limite = limite;
        this.clientes = clientes;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", clientes=" + clientes +
                '}';
    }
}
