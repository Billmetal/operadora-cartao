package operacoes;

import objetos.Conta;

public interface Transacoes {

	boolean sacar(double valor);
	
	void depositar(double valor);
	
	boolean transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
