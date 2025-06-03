package negocio;

public abstract class Mamifero extends Animal {
	// Propriedades da classe
	private int litrosLeite = 0;

	// Métodos construtores da classe
	public Mamifero() {
		super();
	}
	
	public Mamifero(String nome, double altura, double peso) {
		super(nome, altura, peso);
	}

	public Mamifero(String nome, double altura, double peso, int litrosLeite) {
		super(nome, altura, peso);
		this.litrosLeite = litrosLeite;
	}

	public int getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(int litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
}