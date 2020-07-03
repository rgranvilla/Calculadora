package calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	private final JLabel label;
	
	
	public Display() {
		setBackground(new Color(46, 49, 50));
		
		
		label = new JLabel("1234,56");
		label.setForeground(Color.WHITE);
		
		label.setFont(new Font("Roboto Light", Font.PLAIN , 30));
		
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 8, 20));
		
		
		add(label);
	}
}
