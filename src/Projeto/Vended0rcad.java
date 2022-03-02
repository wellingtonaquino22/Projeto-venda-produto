package Projeto;

import java.util.Scanner;

public class Vended0rcad {
	public void CadastrarVneded0r() {
			Main inicio = new Main();
			Scanner input = new Scanner(System.in);
			Vended0r ven = new Vended0r();
			System.out.println("Informe o nome do vendedor:");		
			ven.setNome(input.next());
			System.out.println("Informe o CPF do Vendedor:");		
			ven.setCpf(input.next());
			System.out.println("Informe a data de nascimento do vendedor:");		
			ven.setDataNascimento(input.next());
			System.out.println("Informe o endereço do vendedor:");		
			ven.setEndereco(input.next());
			System.out.println("Informe o sexo do vendedor:");		
			ven.setSexo(input.next());
			System.out.println("Informe o telefone do vendedor:");		
			ven.setTelefone(input.next());
			System.out.println("Nome do vendedor:"+ven.getNome());
			System.out.println("CPF:"+ven.getCpf());
			System.out.println("Data de Nascimento:"+ven.getDataNascimento());
			System.out.println("Sexo::"+ven.getSexo());
			System.out.println("Endereço:"+ven.getEndereco());
			System.out.println("Contato:"+ven.getTelefone());
			inicio.menu();
			
	}
}