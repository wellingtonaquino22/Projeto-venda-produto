package Projeto;

import java.util.Scanner;

public class Main {

		public static int menu() {
			Scanner input = new Scanner (System.in);
			System.out.println("MENU PRINCIPAL");	
			System.out.println("1 - CADASTRAR COMPRADOR");
			System.out.println("2 - CADASTRAR VENDEDOR");
			System.out.println("3 - CADASTRAR PRODUTO");
			System.out.println("0 - SAIR");	
			return input.nextInt();
		}

		
		public static void main (String args[]) {
			Compradorcad compcad = new Compradorcad();
			Vended0rcad vendcad = new Vended0rcad();
			Produtocad procad = new Produtocad();
			Scanner input = new Scanner (System.in);
			int opcao = menu ();
			while(opcao!=0) {
			
		
				switch (opcao) {
				case 1:
					compcad.CadastrarComprador();				
					break;
				case 2:
					vendcad.CadastrarVneded0r();		
					break;
				case 3:				 
					procad.CadastrarProduto();
					break;
				default:
					System.out.println("OPCAO INVALIDA");
					break;
				}	
			}
		}
	}

		


