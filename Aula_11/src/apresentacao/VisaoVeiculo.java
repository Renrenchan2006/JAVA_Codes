package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoVeiculo extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblFabricante = new JLabel("Fabricante");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	private JLabel lblModelo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	private JLabel lblCor = new JLabel("Cor");
	private JComboBox<String> cboCor = new JComboBox<String>();
	
	private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoVeiculo().setVisible(true);
	}
	
	// Método construtor da classe
	public VisaoVeiculo() {
		// Configuração da janela
		setTitle("Cadastro de Veículos");
		setSize(400, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração da combo da fabricante
		lblFabricante.setBounds(10, 10, 200, 20);
		add(lblFabricante);
		cboFabricante.setBounds(10, 30, 365, 20);
		add(cboFabricante);
		cboFabricante.addItem("--- Fabricante ---");
	
		try {
			for (Fabricante objFabricante : Fabricante.getTodos()) {
				cboFabricante.addItem(objFabricante.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// Configuração da caixa de texto do modelo
		lblModelo.setBounds(10, 60, 200, 20);
		add(lblModelo);
		txtModelo.setBounds(10, 80, 365, 20);
		add(txtModelo);
		
		
		// Configuração da combo da cor
		lblCor.setBounds(10, 110, 200, 20);
		add(lblCor);
		cboCor.setBounds(10, 130, 150, 20);
		add(cboCor);
		cboCor.addItem("--- Cor ---");
		cboCor.addItem("Prata");
		cboCor.addItem("Branco");
		cboCor.addItem("Preto");
		cboCor.addItem("Azul");
		cboCor.addItem("Vermelho");
		cboCor.addItem("Amarelo");
		
		// Configuração da caixa de seleção do teto solar
		chkTetoSolar.setBounds(10, 160, 200, 20);
		add(chkTetoSolar);
		
		// Configuração dos botões
		btnGravar.setBounds(30, 190, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(
									cboFabricante, txtModelo, cboCor, chkTetoSolar));
		
		btnLimpar.setBounds(145, 190, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(
									cboFabricante, txtModelo, cboCor, chkTetoSolar));
		
		btnSair.setBounds(260, 190, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}