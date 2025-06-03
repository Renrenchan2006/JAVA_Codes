package negocio;

public class Leopardo extends Mamifero{
	// Propriedades da classe
	private int velocidade;

	// Métodos construtores da classe
	public Leopardo() {
		super();
	}

	public Leopardo(String nome, double altura, double peso, int litrosLeite) {
		super(nome, altura, peso, litrosLeite);
	}

	public Leopardo(String nome, double altura, double peso, int litrosLeite, int velocidade) {
		super(nome, altura, peso, litrosLeite);
		this.velocidade = velocidade;
	}

	// Métodos de acesso da classe
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	// Métodos da classe
	public void correr() {
		System.out.println("Run boy, run!!!");
	}

}
