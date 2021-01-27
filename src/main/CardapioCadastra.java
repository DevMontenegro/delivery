package main;

import java.util.ArrayList;
import java.util.Scanner;
import delivery.Cardapio;
import delivery.Cliente;

public class CardapioCadastra {

	public CardapioCadastra() {
	}

	public static ArrayList<Cardapio> listaCardapio = new ArrayList<Cardapio>();

	private int menu() {

		
		System.out.println(" MENU DE CARDÁPIO ");
		System.out.println("");
		System.out.println(" 1 - Cadastrar cardápio");
		System.out.println(" 2 - Listagem dos cardápios");
		System.out.println(" 0 - Sair");
		
		Scanner input = new Scanner(System.in);

		return input.nextInt();
	}

	public void menuCardapio() {
		Scanner input = new Scanner(System.in);

		int opcaoMenu = menu();

		while (opcaoMenu != 0) {
			switch (opcaoMenu) {
			case 1:
				System.out.println("Cadastro de cardápios");
				System.out.println("");
				cadastraCardapio();
				break;
			case 2:
				listaDosCardapios();
				break;
			default:
				System.out.println("Opção inválida, tente novamente e com mais atenção");
				break;
			}
			opcaoMenu = menu();
		}

	}

	public void cadastraCardapio() {

		Cardapio c = new Cardapio();

		Scanner texto = new Scanner(System.in);

		System.out.print("Digite o código cardápio: ");
		c.setCodigo(Integer.parseInt(texto.nextLine()));

		System.out.print("Digite o nome do cardápio: ");
		c.setnomeCardapio(texto.nextLine());

		System.out.print("Digite o preço: ");
		c.setPreco(Double.parseDouble(texto.nextLine()));

		listaCardapio.add(c);

		System.out.println("");
		System.out.println("Cardápio cadastrado com sucesso");

	}

	public Cardapio localizarCardapio(int codigo) {

		for (Cardapio cardapio : listaCardapio) {
			if (cardapio != null && cardapio.getCodigo() == (codigo)) {
				return cardapio;
			}
		}
		System.out.println("Cardápio não encontrado");
		return null;
	}

	public void listaDosCardapios() {
		if (listaCardapio.isEmpty())
			System.out.println("Não há cardápio cadastrados");
		else
			for (Cardapio cardapio : listaCardapio) {

				System.out.println("Código: " + cardapio.getCodigo());
				System.out.println("Cardápio: " + cardapio.getnomeCardapio());
				System.out.println("Preço: " + cardapio.getPreco());
				System.out.println("");
			}
	}

}
