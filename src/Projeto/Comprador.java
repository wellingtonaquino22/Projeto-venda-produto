package Projeto;

public class Comprador extends Pessoa {
	private String Telefone;
	private String CartaoCredito;
	public Comprador(String nome, String cpf, String dataNascimento, String endereco, String sexo, String cartaocredito) {
		super(nome, cpf, dataNascimento, endereco, sexo);
		this.CartaoCredito = cartaocredito;
	}
	public Comprador(String Comprador) {
		
	}
	public String getCartaoCredito() {
		return CartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		CartaoCredito = cartaoCredito;
	
	}
	
}
