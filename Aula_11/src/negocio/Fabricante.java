package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
	// Propriedades da classe
	private String nome = "";

	// Métodos construtores da classe
	
	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	// Métodos de acesso da classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static Collection<Fabricante> getTodos() throws Exception{
		ArrayList<Fabricante> colecao = new ArrayList<Fabricante>();
		
		colecao.add(new Fabricante("Audi"));
		colecao.add(new Fabricante("BMW"));
		colecao.add(new Fabricante("Chevrolet"));
		colecao.add(new Fabricante("Dodge"));
		colecao.add(new Fabricante("Ferrari"));
		colecao.add(new Fabricante("Honda"));
		colecao.add(new Fabricante("Jaguar"));
		
		return colecao;
	}
	
}
