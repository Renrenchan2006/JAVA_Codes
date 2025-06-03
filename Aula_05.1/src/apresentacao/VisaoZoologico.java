package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;
import negocio.Ave;

public class VisaoZoologico {
	public static void main(String[] args) {
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Animal objAnimal = null;
		int opcao = 0;
		
		// Entrada de dados
		try {
			System.out.print("Digite <1> para cachorro ou " +
									"<2> para leopardo ou " +
									"<3> para águia: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				objAnimal = new Cachorro();
			} else if (opcao == 2) {
				objAnimal = new Leopardo();
			} else {
				objAnimal = new Aguia();
			}
			
			System.out.print("Digite o nome: ");
			objAnimal.setNome(leitor.readLine());
			
			System.out.print("Digite a altura: ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Digite o peso: ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			
			if (opcao == 1) {
				System.out.print("Digite a quantidade de litros de leite: ");
				((Mamifero)objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a força da mordida: ");
				((Cachorro)objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
			}
			
			else if (opcao == 2) {
				System.out.print("Digite a quantidade de litros de leite: ");
				((Mamifero)objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a velocidade: ");
				((Leopardo)objAnimal).setVelocidade(Integer.parseInt(leitor.readLine()));
			}
			
			else {
				System.out.print("Digite a quantidade de ovos: ");
				((Ave)objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a autonomia de voo: ");
				((Aguia)objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
			}
			
		} catch (Exception erro) {
			System.out.println("AUTO DESTRUIÇÃO");
		}
		
		// Saída de dados
		System.out.println("Nome: " + objAnimal.getNome());
		System.out.println("IMC: " + objAnimal.calcularIMC());
		if (opcao == 1) {
		((Cachorro)objAnimal).morder();
	}
		else if (opcao == 2) {
			((Leopardo)objAnimal).correr();
		}
		else {
			((Aguia)objAnimal).voar();
		}
	}
}