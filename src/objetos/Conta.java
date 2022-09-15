package objetos;

import operacoes.Transacoes;

public abstract class Conta implements Transacoes{
	
	private int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private String banco;
	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public String getBanco() {
		return banco;
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
	
	public String clienteNome() {
		return this.cliente.getNome();
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	private boolean semSaldo(double valor) {
		return saldo < valor;		
	}


	@Override
	public boolean sacar(double valor) {
		if(!semSaldo(valor)) {
			saldo -= valor;
			return true;
		} else {
			System.out.println(String.format("Saldo insuficiente !, Saldo = %.2f", this.saldo));
			return false;
		}	 
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if(sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}
		
}
