package components;

import javax.swing.*;
import java.awt.event.*;

public class JLabelExample implements ActionListener {

	JLabel l, l2;
	JButton b;
	
	public void actionPerformed(ActionEvent e) {
		
		l.setText("you clicked on button");
		
	}
	
	JLabelExample(){
		
		JFrame f = new JFrame("JLabelExample");
		l = new JLabel("Welcome to Swing", JLabel.LEFT);
		l2 = new JLabel(new ImageIcon("E:\\Swing\\OIP.jfif"));
		l.setBounds(50,50,150,50);
		l2.setBounds(50,100,200,200);
		f.add(l);
		f.add(l2);
		b = new JButton("Click me");
		b.setBounds(50,30,100,30);
		b.addActionListener(this);
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new JLabelExample();

	}

}
