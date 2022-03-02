package Projeto;

public abstract class Pessoa {
	private String Nome;
	private String Cpf;
	private String dataNascimento;
	private String Endereco;
	private String Sexo;
	
	public Pessoa(String nome, String cpf, String dataNascimento, String endereco, String sexo) {
		super ();
		this.Nome = nome;
		this.Cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.Endereco = endereco;
	}
	public Pessoa( ) {}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		this.Endereco = endereco;
	}
	
	public String getSexo() {
		return Sexo;
	}
	
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}
}
