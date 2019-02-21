
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
import javax.swing.JTextField;

import sun.awt.AWTAccessor.SystemTrayAccessor;

public class calculator implements MouseListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add");
	JButton sub = new JButton("Subtract");
	JButton mult = new JButton("Multiply");
	JButton divi = new JButton("Divide");
	JTextField na = new JTextField();
	JTextField nb = new JTextField();

	int a = 0;
	int b = 0;

	public static void main(String[] args) {
		calculator calc = new calculator();
		calc.format();
	}

	public void format() {
		frame.setVisible(true);

		label.setText(
				"enter two numbers and then select \nwhich operation you want to be performed.\nThen your answer will appear here.");
		frame.add(panel);
		panel.add(label);
		add.addMouseListener(this);
		sub.addMouseListener(this);
		mult.addMouseListener(this);
		divi.addMouseListener(this);

		panel.add(na);

		panel.add(nb);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(divi);
frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String numa = na.getText();
		String numb = nb.getText();
		a = Integer.parseInt(numa);
		b = Integer.parseInt(numb);
		if (e.getSource() == add) {
			int c = a + b;

			label.setText(c + "");
		} else if (e.getSource() == sub) {
			int c = a - b;
			label.setText(c + "");
		} else if (e.getSource() == mult) {
			int c = a * b;
			label.setText(c + "");
		} else if (e.getSource() == divi) {
			int c = a / b;
			label.setText(c + "");
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
