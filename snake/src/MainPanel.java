import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements MouseListener, ActionListener{
	
	Image mainMenu = new ImageIcon("/snake/Images/Gifs/gang gang.gif").getImage();
	public void paint(Graphics g) {
		g.drawImage(mainMenu, 30, 30, this);
	}
	
	public MainPanel() {
		
		
		JFrame j = new JFrame();
		j.setSize(1200, 720);
		Color b = new Color(255,255,255);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setResizable(false);
		j.setBackground(b);
		j.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
