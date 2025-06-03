package apresentacao;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class VisaoRH {
	public static void main(String[] args) {
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		String opcao = "";
		
		// Entrada de dados
		try {
			System.out.print("Digite <C> para colaborador ou <G> para gerente: ");
			opcao = leitor.readLine();
			
			if(opcao.equalsIgnoreCase("C")) {
				objColaborador = new Colaborador();
			}
			else {
				objColaborador = new Gerente();
			}
			
			System.out.print("Digite a matrícula: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Digite o nome: ");
			objColaborador.setNome(leitor.readLine());
			
			System.out.print("Digite o salário: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			
			if(! opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite o bônus: ");
				((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine()));
				}
		}
		catch (Exception erro) {
			System.out.println("O dev vai se matar deu ruim ! ! !" + erro);
			}
		
		// Saída de dados
		System.out.println("Matrícula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salário: " + objColaborador.getSalario());
	}
}
