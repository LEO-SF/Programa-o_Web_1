package contas;
import agencias.Agencia;

public class Conta {
    private double saldo;
    private long numero;
    private Agencia agencia;

    public Conta(){

    }
    public Conta(double saldo, long numero, Agencia agencia) {
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double credita(double valor){
        if(valor < 0){
            throw new RuntimeException("Valor para depósito não pode ser menor que zero");
        }
        else {
            saldo = saldo + valor;
            return saldo;
        }
    }

    public double debita(double valor){
        if(valor > saldo){
            throw new RuntimeException("Saldo insuficiente");
        }
        else {
            saldo = saldo - valor;
            return saldo;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                ", agencia=" + agencia +
                '}';
    }
}
