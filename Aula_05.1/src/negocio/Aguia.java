package negocio;

public class Aguia extends Ave{
	// Propriedades da classe
	private double autonomia = 0;

	// Métodos construtores da classe
	public Aguia() {
		super();
	}

	public Aguia(String nome, double altura, double peso, int quantidadeOvos) {
		super(nome, altura, peso, quantidadeOvos);
	}

	public Aguia(String nome, double altura, double peso, int quantidadeOvos, double autonomia) {
		super(nome, altura, peso, quantidadeOvos);
		this.autonomia = autonomia;
	}

	// Métodos de acesso da classe
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	// Métodos da classe
	public void voar() {
		System.out.println("Zuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuum");
	}
}
