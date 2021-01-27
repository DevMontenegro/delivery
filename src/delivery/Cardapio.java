package delivery;

public class Cardapio {
	private int codigo;
	private String nomeCardapio;
	private double preco;

	public Cardapio() {}

	public Cardapio(int codigo, String cardapio, double preco) {
		super();
		this.codigo = codigo;
		this.nomeCardapio = cardapio;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getnomeCardapio() {
		return nomeCardapio;
	}

	public void setnomeCardapio(String nomeCardapio) {
		this.nomeCardapio = nomeCardapio;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
