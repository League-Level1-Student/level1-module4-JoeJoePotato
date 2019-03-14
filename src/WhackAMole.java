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
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date t = new Date();
	int moles = 0;
	int misses = 0;

	public static void main(String[] args) {
		WhackAMole m = new WhackAMole();
		m.drawButtons(new Random().nextInt(24));
	}

	void drawButtons(int n) {
		frame.add(panel);
		frame.setVisible(true);
		for (int i = 0; i < 24; i++) {
			JButton j = new JButton();
			panel.add(j);
			if (n == i) {
				j.setText("Mole!");
			}
			j.addActionListener(this);
			frame.pack();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	moles=0;
	misses=0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton x = (JButton) e.getSource();
		String word = x.getText();
		if (word.equals("Mole!")) {
			moles += 1;
		} else {
			misses += 1;
		}
		if (moles > 9 || misses > 4) {
			endGame(t, moles);
		System.out.println(moles);
		}
		frame.remove(panel);
		panel=new JPanel();
		Random z= new Random();
		int g= z.nextInt(24);
		drawButtons(g);
	}
}
