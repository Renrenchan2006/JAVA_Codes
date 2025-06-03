package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class VisaoAmazon {
	public static void main(String[] args) {
		// Declaração de variáveis
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(System.in));
		Compra objCompra = new Compra();
		Produto objProduto = new Produto();
		
		// Entrada de dados
		try {
			System.out.print("Informe o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Informe o tipo do produto: ");
			objProduto.setObjTipo(new Tipo(leitor.readLine()));
			
			System.out.print("Informe o preço do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine()));
			
			// Joguei o objProduto e botei dentro do ObjCompra
			objCompra.setObjProduto(objProduto);
			
			System.out.print("Informe a quantidade de produtos: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Informe a data da compra: ");
			objCompra.setData(leitor.readLine());
			
			System.out.print("Informe o número do cartão da compra: ");
			objCompra.setCartao(leitor.readLine());
			
		} catch (Exception erro) {
			System.out.println("Deu	rui	!!!" + erro);
		}	
		
		// Saída de dados
		System.out.println("Produto: " 
					+ objCompra.getObjProduto().getNome());
		System.out.println("Tipo: " 
					+ objCompra.getObjProduto().getObjTipo().getDescricao());
		System.out.println("Data: "
					+ objCompra.getData());
		System.out.println("Valor total: "
					+ objCompra.getQuantidade() 
					* objCompra.getObjProduto().getPreco());
	}
}
