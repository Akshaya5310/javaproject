package chatting.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Server extends JFrame implements ActionListener{
	
	JPanel p1;  //used division
	JTextField t1;
	JButton b1;
	JTextArea a1;
	
	//cerate constructor
	
	Server(){
		
		p1=new JPanel(); // create object
		p1.setLayout(null);
		p1.setBackground(new Color(7, 94, 84));  //color change for panel
		p1.setBounds(0, 0, 400, 70);  //set size
		add(p1);
		
		//add backIcon image
		
		//set image pathset (1)
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3.png"));
		//size change image (6)
		Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		//image directly not send then convert image icon. (7)
		ImageIcon i3 = new ImageIcon(i2);
		//image directly not set in frame use label (2) (8)
		JLabel l1 = new JLabel(i3); //i1 -> i3 
		//create layout (4)
		l1.setBounds(5, 17, 30, 30);
		//element add to frame (5)
		p1.add(l1);
		
		//backIcon mouse event
		
		l1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ae) {
				System.exit(0);
			}
		});
		
		//add dp image
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/1.png"));
		Image i5 = i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel l2 = new JLabel(i6);
		l2.setBounds(40, 5, 60, 60);
		p1.add(l2);
		
		
		//add video
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/video.png"));
		Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		JLabel l5 = new JLabel(i9);
		l5.setBounds(240, 15, 30, 30);
		p1.add(l5);
		
		
		//add phone image
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/phone.png"));
		Image i12 = i11.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i13 = new ImageIcon(i12);
		JLabel l6 = new JLabel(i13);
		l6.setBounds(300, 17, 30, 30);
		p1.add(l6);
		
		
		//add 3icon
		ImageIcon i14 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3icon.png"));
		Image i15 = i14.getImage().getScaledInstance(13, 25, Image.SCALE_DEFAULT);
		ImageIcon i16 = new ImageIcon(i15);
		JLabel l7 = new JLabel(i16);
		l7.setBounds(360, 18, 13, 25);
		p1.add(l7);
		
		//add name
		
		JLabel l3 = new JLabel("Akshaya");  //add name
		l3.setBounds(110, 18, 100, 20);
		l3.setFont(new Font("SAN_SAFIF", Font.BOLD, 18));  //set font size
		l3.setForeground(Color.white);
		p1.add(l3);
		
		
		//add ActiveNow
		
		JLabel l4 = new JLabel("Active Now");  //add name
		l4.setBounds(110, 38, 100, 20);
		l4.setFont(new Font("SAN_SAFIF", Font.PLAIN, 12));  //set font size
		l4.setForeground(Color.white);
		p1.add(l4);
		
		//text field
		t1=new JTextField();
		t1.setBounds(5, 540, 300, 30);
		t1.setFont(new Font("SAN_SARIF", Font.PLAIN, 16));
		add(t1);
		
		//button
		b1=new JButton("send");
		b1.setBounds(310, 540, 80, 30);
		b1.setBackground(new Color(7, 94, 84));
		b1.setForeground(Color.white);
		b1.setFont(new Font("SAN_SARIF", Font.PLAIN, 16));
		add(b1);
		
		//TextArea
		a1=new JTextArea();
		a1.setBounds(5, 75, 390, 460);
		a1.setBackground(Color.pink);
		add(a1);
		
		//frame color change 
		//getContentPane().setBackground(Color.YELLOW);
		
		//swing default layout not require thats why set layout null.(3)
		setLayout(null);
		setSize(400,580);
		setLocation(130,90);
		setUndecorated(true); //hidden header line like minimize maximize and close.
		setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {
		
		new Server().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String out = t1.getText();  //cut in text area.
		a1.setText(t);
		
	}

}
