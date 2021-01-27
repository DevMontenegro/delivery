package delivery;

public class Pedido {
	private int numeroPedido;
	private Cliente cliente;
	private Cardapio cardapio;
	private double valorPedido;

	public Pedido() {}

	public Pedido(int numeroPedido, Cliente cliente, Cardapio cardapio, double valorPedido) {
		super();
		this.numeroPedido = numeroPedido;
		this.cliente = cliente;
		this.cardapio = cardapio;
		this.valorPedido = valorPedido;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

}
