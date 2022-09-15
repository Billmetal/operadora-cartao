package objetos;

public class Cartao {

	private String numero;
	private int cvv;
	private String validade;
	private int parcelas;
	private Conta conta;
	
	public Cartao(Cliente cliente,Conta conta) {
		this.cliente = cliente;
		this.conta = conta;
	}
	
	public int getParcelas() {
		return parcelas;
	}


	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	private Cliente cliente;
	
		
	public Cliente getCliente() {
		return cliente;
	}

	public String getNumero() {
		return numero;
	}
	public int getCvv() {
		return cvv;
	}
	public String getValidade() {
		return validade;
	}

	public Conta getConta() {
		return conta;
	}
	
}
