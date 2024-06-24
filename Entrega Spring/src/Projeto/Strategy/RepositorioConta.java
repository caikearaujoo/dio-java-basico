package Projeto.Strategy;

import Projeto.Conta;

public interface RepositorioConta {
    void salvar(Conta conta);

    Conta buscarPorId(int id);

    void deletar(int id);
}