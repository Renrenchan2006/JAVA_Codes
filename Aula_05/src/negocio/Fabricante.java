package negocio;

public class Fabricante {
	// Propriedades da classe
	private String nome = "";
	
	// Métodos construtores da classe
	public Fabricante () {
		super();
	}
	
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}