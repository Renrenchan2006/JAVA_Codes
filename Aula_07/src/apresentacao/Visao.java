package apresentacao;

import javax.swing.JFrame;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private Painel objPainel = new Painel();
	
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Visao().setVisible(true);
		}
	
	// Método construtor da classe
	public Visao() {
		// Configuração da janela
		setTitle("Minha Primeira Janela Gráfica JAVA !!!!!1!!1!1!");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração do painel
		setContentPane(objPainel);
	}
}