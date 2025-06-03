package negocio;

public class Colaborador {
	// Propriedades da classe
	private int matricula;
	private String nome;
	private double salario;
	
	// Métodos construtores de classe
	public Colaborador() {
		super();
	}
	
	public Colaborador(int matricula, String nome, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		}

	//Getters e Setters
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
