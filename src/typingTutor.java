
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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
import javax.swing.JTextField;

import sun.awt.AWTAccessor.SystemTrayAccessor;

public class typingTutor implements KeyListener {
	char currentLetter;
	JLabel label=new JLabel();
int lives=5;
	JFrame frame=new JFrame("TypeQuest");
	int score=0;
	public static void main(String[] args) {
	typingTutor t=new typingTutor();
	t.setup();
}
	void setup() {
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		label.setFont(label.getFont().deriveFont(29.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.add(label);
		frame.pack();
	}
 char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}
void newLetter() {
	 currentLetter=generateRandomLetter();
	 label.setText(currentLetter+"");
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	char keyCode=e.getKeyChar();

	if(keyCode==currentLetter) {
	score+=1;
	System.out.println("you typed "+currentLetter);

	if(score>49) {		
	System.out.println("You have succeded! The kingdom of Tipyng will revere you as a hero forever.");
	}
	newLetter();
	}else {
		lives-=1;
		System.out.println("you typed "+e+" but you should've typed "+currentLetter);
	if(lives<1) {
		System.out.println("You have lost, please try again next time.");
	System.exit(0);
	}
	newLetter();
	}

}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
