import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Date;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();

public static void main(String[] args) {
	WhackAMole m=new WhackAMole();
m.drawButtons(new Random().nextInt(24));
}
void drawButtons(int n) {
	frame.add(panel);
	frame.setVisible(true);
	for (int i = 0; i < 24; i++) {
	JButton j=new JButton();
		panel.add(j);
		if(n==i) {
			j.setText("Mole!");
		}
		j.addActionListener(this);
}	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

