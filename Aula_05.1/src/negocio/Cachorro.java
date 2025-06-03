package negocio;

public class Cachorro extends Mamifero{
	// Propriedades da classe
	private double forcaMordida = 0;
	
	// Métodos construtores da classe
	public Cachorro() {
		super();
	}

	public Cachorro(String nome, double altura, double peso, int litrosLeite) {
		super(nome, altura, peso, litrosLeite);
	}

	public Cachorro(String nome, double altura, double peso, int litrosLeite, double forcaMordida) {
		super(nome, altura, peso, litrosLeite);
		this.forcaMordida = forcaMordida;
	}
	
	// Métodos de acesso da classe
	public double getForcaMordida(){
		return forcaMordida;
	}
	
	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	// Métodos da classe
	public void morder() {
		System.out.println("Woof! woof! woof!");
	}
	
}
