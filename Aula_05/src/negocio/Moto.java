package negocio;

public class Moto extends Veiculo{
	// Propriedades da classe
	private int cilindrada = 0;

	// Métodos construtores da classe
	public Moto() {
		super();
	}
	
	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}