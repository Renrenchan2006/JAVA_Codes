package negocio;

public class Usado extends Imovel{
	// Propriedades da classe
	private double depreciacao = 0;
	
	// Métodos construtores de classe
	public Usado () {
		super();
	}
	
	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}
	
	// Métodos de acesso dea classe
	public double getDepreciacao() {
		return depreciacao;
	}
	
	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	// Métodos sobrescritos da classe
	public double getValor() {
		return(super.getValor() - this.getDepreciacao());
	}
}