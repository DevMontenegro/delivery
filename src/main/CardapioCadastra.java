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

		
		System.out.println(" MENU DE CARD�PIO ");
		System.out.println("");
		System.out.println(" 1 - Cadastrar card�pio");
		System.out.println(" 2 - Listagem dos card�pios");
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
				System.out.println("Cadastro de card�pios");
				System.out.println("");
				cadastraCardapio();
				break;
			case 2:
				listaDosCardapios();
				break;
			default:
				System.out.println("Op��o inv�lida, tente novamente e com mais aten��o");
				break;
			}
			opcaoMenu = menu();
		}

	}

	public void cadastraCardapio() {

		Cardapio c = new Cardapio();

		Scanner texto = new Scanner(System.in);

		System.out.print("Digite o c�digo card�pio: ");
		c.setCodigo(Integer.parseInt(texto.nextLine()));

		System.out.print("Digite o nome do card�pio: ");
		c.setnomeCardapio(texto.nextLine());

		System.out.print("Digite o pre�o: ");
		c.setPreco(Double.parseDouble(texto.nextLine()));

		listaCardapio.add(c);

		System.out.println("");
		System.out.println("Card�pio cadastrado com sucesso");

	}

	public Cardapio localizarCardapio(int codigo) {

		for (Cardapio cardapio : listaCardapio) {
			if (cardapio != null && cardapio.getCodigo() == (codigo)) {
				return cardapio;
			}
		}
		System.out.println("Card�pio n�o encontrado");
		return null;
	}

	public void listaDosCardapios() {
		if (listaCardapio.isEmpty())
			System.out.println("N�o h� card�pio cadastrados");
		else
			for (Cardapio cardapio : listaCardapio) {

				System.out.println("C�digo: " + cardapio.getCodigo());
				System.out.println("Card�pio: " + cardapio.getnomeCardapio());
				System.out.println("Pre�o: " + cardapio.getPreco());
				System.out.println("");
			}
	}

}
