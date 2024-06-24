package Projeto.Strategy;

import Projeto.Conta;
import Projeto.Singleton.BancodeDados;

public class RepositorioContaMemoria implements RepositorioConta {
    private BancodeDados bancoDeDados;

    public RepositorioContaMemoria() {
        this.bancoDeDados = BancodeDados.getInstancia();
    }

    @Override
    public void salvar(Conta conta) {
        bancoDeDados.salvarConta(conta);
    }

    @Override
    public Conta buscarPorId(int id) {
        return bancoDeDados.buscarContaPorId(id);
    }

    @Override
    public void deletar(int id) {
        bancoDeDados.deletarConta(id);
    }

}
