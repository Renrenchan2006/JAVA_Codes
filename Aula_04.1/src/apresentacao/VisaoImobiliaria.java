package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class VisaoImobiliaria {
	public static void main(String[] args) {
		// Declaração das variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		int opcao = 0;
		
		// Entrada de dados
		try {
			System.out.print("Digite o tipo do imóvel <1> para novo ou <2> para usado: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				objImovel = new Novo();
			} else {
				objImovel = new Usado();
			}
			
			System.out.print("Digite o endereço: ");
			objImovel.setEndereco(leitor.readLine());
			
			System.out.print("Digite a metragem: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Digite o valor: ");
			objImovel.setValor(Double.parseDouble(leitor.readLine()));
			
			if (opcao == 1) {
				System.out.print("Digite o adicional: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
			} else {
				System.out.print("Digite a depreciação: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// Saída de dados
		System.out.println("Endereço: " + objImovel.getEndereco());
		System.out.println("Metragem: " + objImovel.getMetragem());
		System.out.println("Valor: " + objImovel.getValor());
	}
}