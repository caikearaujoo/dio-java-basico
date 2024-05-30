public class Main {
    public static void main(String[] args) {
		Cliente caike = new Cliente();
		caike.setNome("Caike");
		
		Conta cc = new ContaCorrente(caike);
		Conta poupanca = new ContaPoupanca(caike);

        poupanca.imprimirExtrato();
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
