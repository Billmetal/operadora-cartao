package main;

import objetos.Cartao;
import objetos.Cliente;
import objetos.Conta;
import objetos.ContaCorrente;
import objetos.ContaPoupanca;
import objetos.Operadora;

public class Main {

	public static void main(String[] args) {
		Operadora master = new Operadora();
		master.setNome("Master Cartões");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Willian");
		
		Cliente pizzaria = new Cliente();
		pizzaria.setNome("Pizzaria");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poup = new ContaPoupanca(cliente);
		Conta contaPizza = new ContaCorrente(pizzaria);
		
		Cartao cardCliente = new Cartao(cliente, cc);
		
		cc.depositar(100.00);
		cc.transferir(50.50, poup);
		
		cc.sacar(100.00);
		
		System.out.println("\n");
		cc.imprimirExtrato();
		poup.imprimirExtrato();
		
		System.out.println("\n");
		System.out.println("Cliente compra pizzas de 100,00 com cartão");
		master.transacao(cardCliente, 100.00, contaPizza);
		
		cc.imprimirExtrato();
		contaPizza.imprimirExtrato();
		
		System.out.println("\n");
		System.out.println("Cliente compra pizza de 32,45 com cartão");
		master.transacao(cardCliente, 32.45, contaPizza);
		
		cc.imprimirExtrato();
		contaPizza.imprimirExtrato();
	}

}
