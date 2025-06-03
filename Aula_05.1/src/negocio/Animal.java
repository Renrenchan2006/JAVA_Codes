package negocio;

public abstract class Animal {
	// Propriedades da classe
	private String nome = "";
	private double altura = 0;
	private double peso = 0;
	
	// Métodos construtores da classe
	public Animal() {
		super();
	}

	public Animal(String nome, double altura, double peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Métodos da classe
	public double calcularIMC() {
		return(getPeso() / Math.pow(getAltura(), 2));
	}
}