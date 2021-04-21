import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	ImageIcon menu = new ImageIcon("gamer");
	JLabel first;
	
	first = new JLabel("Gamer",menu, SwingConstants.CENTER);
	public void paint(Graphics g) {
		
	}
	
	public MainPanel() {
		
		
		JFrame j = new JFrame();
		j.setSize(1200, 720);
		Color b = new Color(255,255,255);
		j.add(first);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setResizable(false);
		j.setBackground(b);
		j.setVisible(true);
	}
}
