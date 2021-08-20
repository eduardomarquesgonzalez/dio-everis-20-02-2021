package desafio;

public class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 0001;
	private static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	//fazer com que toda conta tenha um cliente (Cliente cliente)
	public Conta(Cliente cliente) {
	
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void depositar() {
		
	}
	
	public void sacar() {

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

	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
	
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	@Override
	public void imprimirExtrato() {		
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero ));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
	}
	
}
