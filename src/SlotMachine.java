import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
JFrame frame=new JFrame("get three in a row to win!");
JButton spin=new JButton("Click to Spin");
JPanel panel=new JPanel();
int one=0;
int two=0;
int three=0;
	public static void main(String[] args) {
	SlotMachine s=new SlotMachine();
	s.setup();
	}
	
	public void setup() {
	frame.add(panel);
	panel.add(spin);
	one=new Random().nextInt(3);
	two=new Random().nextInt(3);
	three=new Random().nextInt(3);
	spin();
	}
	public void spin() {
		if(one==0) {
			loadImageFromComputer("bulbasaur.png");
		}else if(one==1) {
			
		}else {
			
		}
	}
	
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
