package Projeto.Singleton;

import java.util.HashMap;
import java.util.Map;

import Projeto.Conta;

public class BancodeDados {
    private static BancodeDados instancia;
    private Map<Integer, Conta> dadosConta;

    private BancodeDados() {
        dadosConta = new HashMap<>();
    }

    public static synchronized BancodeDados getInstancia() {
        if (instancia == null) {
            instancia = new BancodeDados();
        }
        return instancia;
    }

    public void salvarConta(Conta conta) {
        dadosConta.put(conta.getId(), conta);
        System.out.println("Conta salva: " + conta);
    }

    public Conta buscarContaPorId(int id) {
        return dadosConta.get(id);
    }

    public void atualizarConta(Conta conta) {
        if (dadosConta.containsKey(conta.getId())) {
            dadosConta.put(conta.getId(), conta);
            System.out.println("Conta atualizada: " + conta);
        } else {
            System.out.println("Conta não encontrada: " + conta.getId());
        }
    }

    public void deletarConta(int id) {
        Conta contaRemovida = dadosConta.remove(id);
        if (contaRemovida != null) {
            System.out.println("Conta deletada: " + contaRemovida);
        } else {
            System.out.println("Conta não encontrada: " + id);
        }
    }
}
