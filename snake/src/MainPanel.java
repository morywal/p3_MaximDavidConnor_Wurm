import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	public void paint(Graphics g) {
		
	}
	
	public MainPanel() {
		
		
		JFrame j = new JFrame();
		j.setSize(600, 600);
		Color b = new Color(255,255,255);
		
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setResizable(false);
		j.setBackground(b);
		j.setVisible(true);
	}
}
