
import java.applet.AudioClip;
import java.util.Random; 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;


import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.awt.AWTAccessor.SystemTrayAccessor;
public class ChuckleClicker implements MouseListener {
	JButton joke=new JButton();
	JButton punchline=new JButton();
	public static void main(String[] args) {
		ChuckleClicker c=new ChuckleClicker();
	c.makeButtons();
	}
	public void makeButtons() {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.add(panel);
		frame.setVisible(true);
	
		joke.setText("Joke");
		
		punchline.setText("Punchline");
		joke.addMouseListener(this);
		panel.add(joke);
		punchline.addMouseListener(this);
		panel.add(punchline);
	}
	public void getJoke() {
		Random gen= new Random();
		int rand=gen.nextInt(3);
		if(rand==0) {
			speak("Knock Knock. Who");
		}else if(rand==1) {
			speak("Knock Knock. Interupting cow.");
		}else {
			speak("Some people call me average.");
		}
	}
	public void getPunchline() {
		Random gen= new Random();
		int rand=gen.nextInt(3);
		if(rand==0) {
			speak("Are you an owl?");
		}else if(rand==1) {
			speak("MOO!");
		}else {
			speak("But thats just mean.");
		}
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == joke){
		getJoke();		
		}
		if(e.getSource() == punchline){	
		getPunchline();
		}
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
