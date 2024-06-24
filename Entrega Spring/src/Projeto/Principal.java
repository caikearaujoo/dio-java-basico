package Projeto;

import Projeto.Strategy.RepositorioContaMemoria;
import Projeto.Facade.FachadaBanco;


public class Principal {
    public static void main(String[] args) {
        RepositorioContaMemoria repositorioConta = new RepositorioContaMemoria();
        FachadaBanco fachadaBanco = new FachadaBanco(repositorioConta);

        fachadaBanco.criarConta(1, "Caike Araújo", 1000.0);
        fachadaBanco.criarConta(2, "Amanda Duarte", 2000.0);

        fachadaBanco.obterDetalhesConta(1);
        fachadaBanco.obterDetalhesConta(2);

        // Testar operações de atualização e deleção
        Conta contaAtualizada = new Conta(1, "Caike Araújo atualizado", 1500.0);
        repositorioConta.salvar(contaAtualizada);
        fachadaBanco.obterDetalhesConta(1);

        repositorioConta.deletar(2);
        fachadaBanco.obterDetalhesConta(2);
    }
}
