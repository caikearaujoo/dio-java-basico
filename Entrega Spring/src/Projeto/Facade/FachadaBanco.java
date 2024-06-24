package Projeto.Facade;

import Projeto.Conta;
import Projeto.Strategy.RepositorioConta;

public class FachadaBanco {
    private RepositorioConta repositorioConta;

    public FachadaBanco(RepositorioConta repositorioConta) {
        this.repositorioConta = repositorioConta;
    }

    public void criarConta(int id, String nome, double saldo) {
        Conta conta = new Conta(id, nome, saldo);
        repositorioConta.salvar(conta);
    }

    public void obterDetalhesConta(int id) {
        Conta conta = repositorioConta.buscarPorId(id);
        if (conta != null) {
            System.out.println("Detalhes da Conta: " + conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}