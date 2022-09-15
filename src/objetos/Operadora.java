package objetos;

import java.util.List;

public class Operadora {

	private String nome;
	private List<Cliente> clientes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void transacao(Cartao cartao, double valor, Conta clienteDestino ) {
		if(cartao.getConta().transferir(valor, clienteDestino)) {
			System.out.println("=== Transação por Operadora " + getNome() + " ===");
			System.out.println(String.format("Compra autorizada para %s no valor de %.2f", clienteDestino.clienteNome(),valor));
		} else {
			System.out.println("Transação não autorizada !!");
		}
	}
	
}
