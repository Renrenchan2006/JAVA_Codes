package negocio;

public class Cilindro implements Solido{
	private double raio = 0;
	private double altura = 0;
	
	// Métodos construtores de classe
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}
	
	// Métodos de acesso da classe
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Métodos implementados da classe
	public double calcularArea() {
		return(2 * Math.PI * Math.pow(getRaio(), 2) ) +
			  (2 *Math.PI * getRaio() * getAltura());
	}
	
	public double calcularVolume() {
		return(Math.PI * Math.pow(getRaio(), 2) * getAltura());
	}
}
