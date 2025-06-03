package negocio;

public class Gerente extends Colaborador {
	// Propriedades
	private double bonus;
	
	// Construtors
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}
	
	// Get e Set
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	// Método sobrescritos da classe
	public double getSalario() {
		return (super.getSalario() + this.getBonus());
	}
}
