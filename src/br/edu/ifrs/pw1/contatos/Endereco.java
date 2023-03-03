package br.edu.ifrs.pw1.contatos;

public class Endereco {
    private String logradouro;
    private String complemento;
    private long cep;

    @Override
    public String toString() {
        return super.toString() + "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep=" + cep +
                '}';
    }

    public Endereco(){}
    public Endereco(String logradouro, String complemento, long cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }
}
