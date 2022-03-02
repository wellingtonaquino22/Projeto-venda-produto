package Projeto;

import java.util.Scanner;

public class Produtocad {
	
	public void CadastrarProduto() {
			Main inicio = new Main();
			Scanner input = new Scanner(System.in);
			Produto pro = new Produto();
			System.out.println("Informe o nome do produto:");		
			pro.setNome(input.next());
			System.out.println("Informe o estado do produto:");		
			pro.setEstado(input.next());
			System.out.println("Informe o tempo de uso do produto:");		
			pro.setTempoUso(input.next());
			System.out.println("Nome do produto:"+pro.getNome());
			System.out.println("Estado do produto:"+pro.getEstado());
			System.out.println("Tempo de uso:"+pro.getTempoUso());
			inicio.menu();
			}
		}
	
