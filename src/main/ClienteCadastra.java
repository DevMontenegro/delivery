package main;

import java.util.ArrayList;
import java.util.Scanner;
import delivery.Cliente;

public class ClienteCadastra {

	public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	public ClienteCadastra() {

	}

	private int menu() {

		System.out.println(" MENU DE CLIENTES ");
		System.out.println("");
		System.out.println(" 1 - Cadastrar clientes");
		System.out.println(" 2 - Listagem dos clientes");
		System.out.println(" 0 - Sair");
		
		Scanner input = new Scanner(System.in);

		return input.nextInt();
	}

	public void menuCliente() {
		Scanner input = new Scanner(System.in);

		int opcaoMenu = menu();

		while (opcaoMenu != 0) {
			switch (opcaoMenu) {
			case 1:
				System.out.println("Cadastro de clientes");
				System.out.println("");
				cadastraClientes();
				break;
			case 2:
				System.out.print("Clientes cadastrados: ");
				System.out.print("");
				listaDosClientes();
				break;
			default:
				System.out.println("Opção inválida, tente novamente e com mais atenção");
				break;
			}
			opcaoMenu = menu();
		}

	}

	public static void cadastraClientes() {

		Cliente c = new Cliente();

		Scanner texto = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		c.setNome(texto.nextLine());

		System.out.print("Digite seu login: ");
		c.setLogin(texto.nextLine());

		System.out.print("Digite uma senha: ");
		c.setSenha(texto.nextLine());

		System.out.print("Digite seu endereço para entrega: ");
		c.setEndereco(texto.nextLine());

		listaClientes.add(c);

		System.out.println("");
		System.out.println("Cadastro do cliente realizado com sucesso");

	}

	public static void listaDosClientes() {
		if (listaClientes.isEmpty()) {
			System.out.println("Não há clientes cadastrados");
		} else
			System.out.println("");
		for (Cliente cliente : listaClientes) {

			System.out.println("Cliente: " + cliente.getNome());
			System.out.println("Login: " + cliente.getLogin());
			System.out.println("Endereco: " + cliente.getEndereco());
			System.out.println("");
		
}
	}
	public Cliente localizarCliente(String login) {
		Scanner input = new Scanner(System.in);

		for (Cliente cliente : listaClientes) {
			if (cliente != null && cliente.getLogin().equalsIgnoreCase(login)) {

				System.out.print("Digite a senha: ");
				String comparaSenha = input.next();

				if (comparaSenha.equals(cliente.getSenha())) {

					return cliente;
				} else {
					System.out.println("Senha incorreta!");
				}

			} else
				System.out.println("Cliente não encontrado");
		}

		return null;
}
}