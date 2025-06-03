package apresentacao;

import negocio.Pessoa;

public class Visao {
	public static void main (String[] args) {
		Pessoa obj1 = new Pessoa();
		obj1.setNome("Junior");
		obj1.setEndereco("SQNW 307");
		obj1.setTelefone("99995");
		
		Pessoa obj2 = new Pessoa("Fulano", "Asa Norte", "234-5678");

		System.out.println("==== Objeto 1 ====");
		System.out.println("Nome do objeto 1: " + obj1.getNome());
		System.out.println("Endereco do objeto 1: " + obj1.getEndereco());
		System.out.println("Telefone do objeto 1: " + obj1.getTelefone());
		
		System.out.println("==== Objeto 2 ====");
		System.out.println("Nome do objeto 2: " + obj2.getNome());
		System.out.println("Endereco do objeto 2: " + obj2.getEndereco());
		System.out.println("Telefone do objeto 2: " + obj2.getTelefone());
	}
}