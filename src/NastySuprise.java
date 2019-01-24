

	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.net.MalformedURLException;
	import java.net.URL;
	import javax.swing.JButton;
	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class NastySuprise implements MouseListener {
		JButton treat=new JButton();
		JButton trick=new JButton();
		public static void main(String[] args) {
			NastySuprise ns=new NastySuprise();
		ns.everything();	
		}
		private void everything() {
			JFrame fred=new JFrame();
			fred.setVisible(true);
			JPanel panel=new JPanel();
			JLabel treeck=new JLabel();
			JLabel treet=new JLabel();
			fred.add(panel);
			trick.addMouseListener(this);
			treat.addMouseListener(this);
	panel.add(trick);
	panel.add(treat);
	treeck.setText("Trick");
	treet.setText("treat");
	trick.add(treeck);
	treat.add(treet);
	fred.pack();
		}
		
		private void showPictureFromTheInternet(String imageUrl) {
		     try {
		          URL url = new URL(imageUrl);
		          Icon icon = new ImageIcon(url);
		          JLabel imageLabel = new JLabel(icon);
		          JFrame frame = new JFrame();
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();
		     } catch (MalformedURLException e) {
		          e.printStackTrace();
		     }
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		JButton pressed=(JButton)e.getSource();
		if(pressed==trick) {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjFL9Rt1e5fDMijOj2U66Wq4JPeI3q9oEI-YkF7kOP7pA-qjzS");
		}else {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2YhPj0KdwN5daJvZjLjnteXmIF7vkBE0U31itgGfGhWQ9BDkm8w");
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


