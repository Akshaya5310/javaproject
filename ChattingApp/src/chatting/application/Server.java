package chatting.application;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends JFrame{
	
	JPanel p1;
	
	//cerate constructor
	
	Server(){
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3.png"));
		JLabel l1 = new JLabel(i1);
		setSize(400,600);
		setLocation(130,90);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Server().setVisible(true);

	}

}
