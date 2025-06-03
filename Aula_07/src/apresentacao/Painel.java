package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Chão
		g.setColor(Color.green);
		g.fillRect(0, 400, 1024, 368);
		
		// Céu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1024, 400);
		
		// Sol
		g.setColor(Color.orange);
		g.fillOval(850, 40, 140, 140);
		g.setColor(Color.yellow);
		g.fillOval(850, 40, 110, 110);
		
		// Frente da casa
		g.setColor(Color.black);
		g.drawRect(100, 420, 80, 160);
		
		// Telhado da frente da casa
		g.drawLine(100, 420, 140, 340);
		g.drawLine(180, 420, 140, 340);
		
		// Lateral da casa
		g.drawLine(180, 580, 450, 500);
		g.drawLine(450, 500, 450, 340);
		g.drawLine(180, 420, 450, 340);
		
		// Telhado da lateral da casa
		g.drawLine(140, 340, 400, 280);
		g.drawLine(450, 340, 400, 280);
		
		// Boneco cabeçudo
		g.fillOval(800, 450, 30, 30);
		g.setColor(Color.white);
		g.fillOval(800, 450, 28, 28); // Cabeça
		g.setColor(Color.black);
		g.drawLine(815, 480, 815, 540); //Tronco
		g.drawLine(790, 500, 840, 500); // Braços
		g.drawLine(815, 540, 780, 570); // Perna esquerda
		g.drawLine(815, 540, 850, 570); // Perna direita
	}
}