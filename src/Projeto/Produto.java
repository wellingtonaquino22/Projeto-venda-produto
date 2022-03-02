package Projeto;

public class Produto {
	private String Nome;
	private String Estado;
	private String TempoUso;
	
	public Produto(String nome, String estado, String tempoUso) {
		super();
		Nome = nome;
		Estado = estado;
		TempoUso = tempoUso;
	}
	public Produto () {
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getTempoUso() {
		return TempoUso;
	}

	public void setTempoUso(String tempoUso) {
		TempoUso = tempoUso;
	}
	

}
