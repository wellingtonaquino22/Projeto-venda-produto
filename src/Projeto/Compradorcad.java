package Projeto;
import java.util.Scanner;
public class Compradorcad {

		public void CadastrarComprador() {
				Main inicio = new Main();
				Scanner input = new Scanner(System.in);
				Comprador con = new Comprador("");
				System.out.println("Informe o nome do comprador:");		
				con.setNome(input.next());
				System.out.println("Informe o CPF do comprador:");		
				con.setCpf(input.next());
				System.out.println("Informe a data de nascimento do comprador:");		
				con.setDataNascimento(input.next());
				System.out.println("Informe o endere�o do comprador:");		
				con.setEndereco(input.next());
				System.out.println("Informe o sexo do comprador:");		
				con.setSexo(input.next());
				System.out.println("Inform o cart�o de cr�dito do comprador:");
				con.setCartaoCredito(input.next());
				System.out.println("Nome do Comprad:"+con.getNome());
				System.out.println("CPF:"+con.getCpf());
				System.out.println("Data de Nascimento:"+con.getDataNascimento());
				System.out.println("Sexo::"+con.getSexo());
				System.out.println("Endere�o:"+con.getEndereco());
				System.out.println("Cart�o:"+con.getCartaoCredito());
				inicio.menu();
				
		}
	}
