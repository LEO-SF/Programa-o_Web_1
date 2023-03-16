package Enum;

public enum Menu {
    CADASTRAR(1, "Cadastrar Conta Especial"), PESQ(2, "Pesquisar Conta Especial"),
    PESQA(3, "Pesquisar Conta Especial por agência"), PESQCPF(4, "Pesquisar Conta Especial por CPF"),
    LISTAR(5, "Listar todos clientes"), SAIR(6, "SAIR");

    private final int valor;
    private final String descricao;
    private Menu(int valorOpcao, String descricao){
        valor = valorOpcao;
        this.descricao = descricao;
    }
    public int getValor(){
        return valor;
    }
    public String getDescricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return this.getValor() + " - " + this.getDescricao();
    }

}
