package calc.visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("Roboto Light", Font.PLAIN, 20));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setMinimumSize(new Dimension(50,50));
		setPreferredSize(new Dimension(50,50));
		setMaximumSize(new Dimension(50,50));
	}
}
