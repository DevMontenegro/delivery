package main;

import java.util.ArrayList;
import java.util.Scanner;

import delivery.Pedido;
import delivery.Venda;
import delivery.Cardapio;
import delivery.Cliente;

public class PedidoCadastra {

	public ClienteCadastra cliente;
	public CardapioCadastra cardapio;
	public Cardapio valor;

	public ArrayList<Pedido> listaPedido = new ArrayList<Pedido>();

	public PedidoCadastra(ClienteCadastra cliente, CardapioCadastra cardapio, Cardapio valor) {
		super();
		this.cliente = cliente;
		this.cardapio = cardapio;
		this.valor = valor;
	}

	public PedidoCadastra() {
	}

	private int menu() {

		
		System.out.println(" MENU DE PEDIDO ");
		System.out.println("");
		System.out.println(" 1 - Fazer um pedido");
		System.out.println(" 2 - Listagem dos pedidos");
		System.out.println(" 0 - Sair");
		System.out.println("");
		Scanner input = new Scanner(System.in);

		return input.nextInt();
	}

	public void menuPedido() {
		Scanner input = new Scanner(System.in);

		int opcaoMenu = menu();

		while (opcaoMenu != 0) {
			switch (opcaoMenu) {
			case 1:
				System.out.println("Fazer pedido");
				System.out.println("");
				realizarPedido();
				break;
			case 2:
				listaDosPedidos();
				break;
			default:
				System.out.println("Opção inválida, tente novamente e com mais atenção");
				break;
			}
			opcaoMenu = menu();
		}

	}

	public void realizarPedido() {

		VendaCadastra venda = new VendaCadastra();
		Pedido pedido = new Pedido();
		ClienteCadastra cliente = new ClienteCadastra();
		CardapioCadastra cardapio = new CardapioCadastra();
		Scanner input = new Scanner(System.in);

		System.out.print("Senhor cliente, informe seu login: ");
		pedido.setCliente(cliente.localizarCliente(input.next()));

		if (pedido.getCliente() != null) {

			cardapio.listaDosCardapios();

			if (!cardapio.listaCardapio.isEmpty()) {

				System.out.print("Infome o código do cardápio: ");

				pedido.setCardapio(cardapio.localizarCardapio(Integer.parseInt(input.next())));
				pedido.setValorPedido(pedido.getCardapio().getPreco());
				
				listaPedido.add(pedido);
				venda.cadastraVenda(pedido.getCardapio().getnomeCardapio(), pedido.getCliente().getNome(), pedido.getValorPedido());
				
				
				
				System.out.println("Pedido realizado com sucesso.");

				System.out.println("Cliente: " + pedido.getCliente().getNome());
				System.out.println("Cardápio: " + pedido.getCardapio().getnomeCardapio());
				System.out.println("Valor: " + pedido.getValorPedido());
				System.out.println("Endereço de entrega: " + pedido.getCliente().getEndereco());
				
				System.out.println("");
				

			}
		}
	}
	public void listaDosPedidos() {
		if (listaPedido.isEmpty()) {
			System.out.println("Não há clientes cadastrados");
		} else
			System.out.println("");
		for (Pedido pedido : listaPedido) {

			System.out.println("Nome do cliente: " + pedido.getCliente().getNome());
			System.out.println("Cardápio: " + pedido.getCardapio().getnomeCardapio());
			System.out.println("Valor do pedido: " + pedido.getValorPedido());
			System.out.println("");
	}
}
}