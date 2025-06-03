package negocio;

public abstract class Ave extends Animal{
	// Propriedades da classe
	private int quantidadeOvos = 0;

	// Métodos construtores da classe
	public Ave() {
		super();
	}
	
	public Ave(String nome, double altura, double peso) {
		super(nome, altura, peso);
	}

	public Ave(String nome, double altura, double peso, int quantidadeOvos) {
		super(nome, altura, peso);
		this.quantidadeOvos = quantidadeOvos;
	}

	// Métodos de acesso da classe
	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
}
