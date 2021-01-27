package main;

import java.util.Scanner;
/*-------------ALUNOS------------------
 * Danielle Rafael de Lima
 * Deyvid Yancey Guedes Silva
 * Guilherme Vinicius Silva Souza
 * Gustavo Batista Montenegro
 * Kamylle Beatriz Rodrigues Sousa
 */
public class Main {
	
	public static int menuPrincipal() {
		
		
		System.out.println("MENU PRINCIPAL - ADMINISTRAÇÃO");
		System.out.println("");
		System.out.println(" 1 - Menu de cardapios");
		System.out.println(" 2 - Menu de clientes");		
		System.out.println(" 3 - Listagem das vendas");
		System.out.println(" 4 - Fazer pedido");
		System.out.println(" 0 - Sair");
		
		
		Scanner itemMenu = new Scanner(System.in);

		return itemMenu.nextInt();
		
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(" DELIVERY FACOL CENTER ");
	
		System.out.println("");
		
		ClienteCadastra clie = new ClienteCadastra();
		CardapioCadastra card = new CardapioCadastra();
		VendaCadastra vend = new VendaCadastra();
		PedidoCadastra ped = new PedidoCadastra();
		
		int itemMenu =menuPrincipal();
		
		while(itemMenu!=0) {	
			
			switch (itemMenu) {
			case 1:
				card.menuCardapio();				
				break;
			case 2:
				clie.menuCliente();		
				break;
			case 3:				 
				 vend.menuVendas();	
				break;
			case 4:				 
				 ped.menuPedido();	
				break;
			default:
				System.out.println("OPCAO INVALIDA");
				break;
			}
			itemMenu = menuPrincipal();					
		}
		
	}

}
