public abstract class Conta implements IConta {
    	
	private static final int agencia_padrao = 1;
	private static int num_sequencial = 1;

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) { //Construtor de Conta, usa um cliente(que tem nome)
		this.agencia = Conta.agencia_padrao;
		this.numero = num_sequencial++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
        if(valor <= this.saldo) saldo -= valor;
        else return;
	}

	@Override
	public void depositar(double valor) {
        if(valor>=0) saldo += valor;
        else return;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo atual: %.2f", this.saldo));
	}
}
