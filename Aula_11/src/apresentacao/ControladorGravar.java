package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Fabricante;
import negocio.Veiculo;

public class ControladorGravar implements ActionListener {

	// Propriedades da classe
	private JComboBox<String> cboFabricante = null;
	private JTextField txtModelo = null;
	private JComboBox<String> cboCor = null;
	private JCheckBox chkTetoSolar = null;
			
			
	// Métodos construtor cheio da classe
	ControladorGravar(JComboBox<String> cboFabricante, JTextField txtModelo, JComboBox<String> cboCor,
			JCheckBox chkTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.cboCor = cboCor;
		this.chkTetoSolar = chkTetoSolar;
	}
	
	// Métodos implementado da interface
	public void actionPerformed(ActionEvent e) {
		// Crítica de dados
		if (cboFabricante.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo fabricante obrigatório !");
			return;
		}
		if (txtModelo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo modelo obrigatório !");
			return;
		}
		if (cboCor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo fabricante obrigatório !");
			return;
		}
		
		// Composição do objeto
		Veiculo objVeiculo = new Veiculo();
	
		objVeiculo.setObjFabricante(new Fabricante(
									cboFabricante.getSelectedItem().toString()));
		objVeiculo.setModelo(txtModelo.getText());
		objVeiculo.setCor(cboCor.getSelectedItem().toString());
		objVeiculo.setTetoSolar(chkTetoSolar.isSelected());
	
		JOptionPane.showMessageDialog(null,  "Gravação realizada com sucesso !\n\n" +
					"Fabricante: " + objVeiculo.getObjFabricante().getNome() +"\n"+
					"Modelo: " + objVeiculo.getModelo() + "\n" +
					"Cor: " + objVeiculo.getCor() + "\n" +
					"Teto Solar: " + (objVeiculo.isTetoSolar() ? "SIM" : "NÃO"));
	}

}