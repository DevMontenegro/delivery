package main;

import java.util.ArrayList;
import java.util.Scanner;
import delivery.Venda;

public class VendaCadastra {
	
	
	public static ArrayList<Venda> listaVendas = new ArrayList<Venda>();

	public VendaCadastra() {}
	
	private int menu() {

		System.out.println("");
		System.out.println(" MENU DE VENDAS ");
		System.out.println(" 1 - Listagem das vendas");
		System.out.println(" 0 - Sair");
		System.out.println("");
		Scanner input = new Scanner(System.in);

		return input.nextInt();
	}
	
	public void menuVendas() {
		Scanner input = new Scanner(System.in);

		int opcaoMenu = menu();

		while (opcaoMenu != 0) {
			switch (opcaoMenu) {
			case 1:
				listagemVendas();
				break;
			default:
				System.out.println("Opção inválida, tente novamente e com mais atenção");
				break;
			}
			opcaoMenu = menu();
		}

	}
	
	public void cadastraVenda(String cardapio, String cliente, double valor) {
		
		Venda venda = new Venda(cardapio, cliente, valor);
		listaVendas.add(venda);
						
	}
	
	public static void listagemVendas() {
		if (listaVendas.isEmpty())
			System.out.println("Não há vendas cadastradas");
		else
			for (Venda vendas : listaVendas) {
				
				System.out.println("Cliente: " + vendas.getCliente());
				System.out.println("Cardápio: " + vendas.getCardapio());
				System.out.println("Preço: " + vendas.getValor());
				System.out.println("");
			}
	}

}