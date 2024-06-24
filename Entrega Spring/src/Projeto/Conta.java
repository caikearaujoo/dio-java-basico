package Projeto;

public class Conta {
    private int id;
    private String nome;
    private double saldo;

    public Conta(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{id=" + id + ", nome='" + nome + "', saldo=" + saldo + '}';
    }
}
