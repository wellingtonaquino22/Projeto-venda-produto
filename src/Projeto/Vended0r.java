package Projeto;

public class Vended0r extends Pessoa {
	private String Telefone;

	public Vended0r(String nome, String cpf, String dataNascimento, String endereco, String sexo, String telefone) {
		super(nome, cpf, dataNascimento, endereco, sexo);
		this.Telefone = telefone;
	}
	public Vended0r () {
	}
	
	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;	}
}
