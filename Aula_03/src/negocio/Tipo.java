package negocio;

public class Tipo {
	// Propriedades da classe
	private String descricao = "";

	// Método contrustora de classes
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
