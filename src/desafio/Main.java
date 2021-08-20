package desafio;

public class Main {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Eduardo");
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(cliente);
		cc.transferir(70, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}