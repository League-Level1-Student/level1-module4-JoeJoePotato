import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame("get three in a row to win!");
	JButton spin = new JButton("Click to Spin");
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		SlotMachine s = new SlotMachine();
		s.setup();
	}

	public void setup() {
		frame.add(panel);
		panel.add(spin);
		frame.setVisible(true);
		spin.addActionListener(this);
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.remove(panel);
		frame.setTitle("Get three in row to win!");
		panel=new JPanel();
		panel.add(spin);
		int b=0;
		int c=0;
		int s=0;
		for (int i = 0; i < 3; i++) {
			JLabel j = new JLabel();
			int n = new Random().nextInt(3);
			if (n == 0) {
				j = loadImageFromComputer("bulbasaur.png");
			b+=1;
			} else if (n == 1) {
				j = loadImageFromComputer("charmander.png");
		c+=1;
			} else {
				j = loadImageFromComputer("squirtle.png");
			s+=1;
			}
			panel.add(j);
		}
		if(c==3||s==3||b==3) {
			frame.setTitle("You won!");
		}
		frame.add(panel);
		frame.pack();
	}
}
