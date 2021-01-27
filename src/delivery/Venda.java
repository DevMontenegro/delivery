package delivery;

public class Venda {
	private String cardapio;
	private String cliente;
	private double valor;
	
	public Venda(String cardapio, String cliente, double valor) {
		super();
		this.cardapio = cardapio;
		this.cliente = cliente;
		this.valor = valor;
	}


	public Venda() {}

	public String getCardapio() {
		return cardapio;
	}

	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
