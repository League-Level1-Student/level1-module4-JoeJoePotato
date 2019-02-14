
import java.applet.AudioClip;
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

public class calculator {
JFrame frame=new JFrame();
JLabel label= new JLabel();
JButton add=new JButton("Add");
JButton sub=new JButton("Subtract");
JButton mult=new JButton("Multiply");
JButton divi=new JButton("Divide");

	public static void main(String[] args) {
	calculator calc=new calculator();
	calc.format();
	}
	public void format() {
		frame.setVisible(true);
		frame.add(label);
label.add(add);
	}
}
