public class Cliente {

    private String nome;
    private Conta conta;
    private String cpf;
    private String CEP;

    public Cliente(){

    }
    
    public Cliente(String nome, Conta conta, String cpf, String cep){
        setNome(nome);
        setConta(conta);
        setCpf(cpf);
        setCEP(cep);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
