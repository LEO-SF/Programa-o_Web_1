package Teste;
import interfaces.ValidaCPF;
import Enum.Menu;
import clientes.Cliente;
import contas.*;
import agencias.Agencia;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.Scanner;
// importanto a classe "ValidaCPF" do pacote "meuPacote"
public class Exemplo {

    public static void main(String[] args) {

       /* Scanner ler = new Scanner(System.in);

        String CPF;
        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        if (ValidaCPF.isCPF(CPF) == true)
            System.out.printf("CPF válido");
        else System.out.printf("Erro, CPF invalido !!!\n");*/
        ArrayList<ContaEspecial> contas = new ArrayList<>();

        while(true) {
            switch(montaMenu()) {
                case 1://Cadastrar conta especial
                    int numAg = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da agência:"));
                    String endereco = JOptionPane.showInputDialog(null, "Informe o endereço da agência:");

                    int numCt = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta:"));
                    long saldo = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o saldo da conta:"));
                    double limite = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite da conta:"));

                    int numClientes = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos clientes?"));
                    int cont = 0;
                    //cria a lista de enderecos de um aluno
                    ArrayList<Cliente> clientes = new ArrayList<>();
                    while(cont < numClientes) {
                        //leitura dos dados de um endereco
                        boolean testeCpf = false;
                        String cpf = "";
                        do{
                            cpf = JOptionPane.showInputDialog(null, "Informe o Cpf:");

                            Cliente tester = new Cliente(cpf, null);
                            if (ValidaCPF.isCPF(cpf) == true)
                                System.out.printf("CPF válido");
                            else JOptionPane.showMessageDialog(null, "Erro, CPF invalido !!!\n");
                        }while(!testeCpf);

                        String nome = JOptionPane.showInputDialog(null, "Informe o Nome:");
                        //adiciona na lista de clientes da conta cada cliente lido
                        //   Cliente cliente = new Cliente(cpf, nome);
                        clientes.add(new Cliente(cpf, nome));
                        cont++;
                    }
                    //adiciona na lista de contas uma conta com todos os seus dados
                    //   double saldo, long numero, Agencia agencia, double limite, List<Cliente> clientes
                    contas.add(new ContaEspecial(saldo, numCt, new Agencia(numAg, endereco), limite, clientes));

                    break;
                case 2://Pesquisar conta usando o número dela
                    //lê o número que será pesquisado na lista de contas
                    long numCtPesquisa = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o número da conta de pesquisa:"));
                    //flag vai sinalizar se achou ou não o objeto na lista
                    boolean flag = false; //o objeto não está na lista
                    //verifica se a lista foi criada

                    if(contas!=null) {
                        for (Conta conta : contas) {
                            if(conta.getNumero() == numCtPesquisa) {
                                JOptionPane.showMessageDialog(null, "Achou este número de conta na lista");
                                flag = true;
                                //  Como sair do laço aqui quando encontra o dado buscado?
                            }
                        }
                    }
                    if(flag == false) //ou if(!flag)
                        JOptionPane.showMessageDialog(null, "não achou este número de conta na lista");

                    //verdadeiro pro flag
                    //if(flag==true) ou if(flag)
                    break;
                case 3: //Pesquisar conta usando o número da agência
                    //lê o número que será pesquisado na lista de contas
                    long numAgPesquisa = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o número da agência da conta de pesquisa:"));
                    //flag vai sinalizar se achou ou não o objeto na lista
                    flag = false; //o objeto não está na lista
                    //verifica se a lista foi criada

                    if(contas!=null) {
                        for (Conta conta : contas) {
                            if(conta.getAgencia().getNumero() == numAgPesquisa) {
                                JOptionPane.showMessageDialog(null, "Achou este número de agência na lista");
                                flag = true;
                                //  Como sair do laço aqui quando encontra o dado buscado?
                            }
                        }
                    }
                    if(flag == false) //ou if(!flag)
                        JOptionPane.showMessageDialog(null, "Não achou este número de conta na lista");
                    break;

                case 4://comparação de string DEVE usar o equals()
                    //comparação de números DEVE usar o ==
                    //Pesquisar conta usando o CPF do cliente
                    String cpfPesquisa = JOptionPane.showInputDialog(null,
                            "Informe o CPF do cliente de pesquisa:\n (formato nnn.nnn.nnn-dd)");
                    //flag vai sinalizar se achou ou não o objeto na lista
                    flag = false; //o objeto não está na lista
                    //verifica se a lista foi criada

                    if(contas!=null) {
                        for (ContaEspecial conta : contas) {
                            if(conta.getClientes() != null) {
                                for (Cliente cliente : conta.getClientes()){
                                    if(cliente.getCpf() != null) { // Dá pra pular essa verificação aqui, não? Pq se for "mull", vai dar diferente de qq jeito. Ou não?
                                        if(cliente.getCpf().equals(cpfPesquisa)) {
                                            JOptionPane.showMessageDialog(null, "Minha nossa! Depois de tudo... achou o CPF na lista de contas!");
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(flag == false) //ou if(!flag)
                        JOptionPane.showMessageDialog(null, "não achou o nome na lista");
                    break;
                case 5: //listar todos
                    if(contas!=null) {
                        for (Conta conta : contas) {
                            // System.out.println(conta);
                            JOptionPane.showMessageDialog(null, conta);
                            System.out.println(conta);
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "não existem contas cadastradas ainda!");
                    break;
                case 6: System.exit(0);
                    break;
            }
        }
    }
    private static int montaMenu() {
        String str = "";
        for(Menu opcaoMenu : Menu.values())
            str +=  opcaoMenu.toString()+"\n";
        return Integer.parseInt(JOptionPane.showInputDialog(str));
    }

        /*Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF) == true)
            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");*/
    }


