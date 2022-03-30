package components;

// classes for using action Listener
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// classes for using swing components
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonExample implements ActionListener {

	JButton b, b2;
	int t = 0, t2 = 0;
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			if(t % 2 ==  0) {
				b.setBounds(20,50,300,30);
				b.setText("you have clicked me");
			}else {
				b.setText("Click me");
				b.setBounds(50,50,100,30);;
			}
			t++;
		}else {
			b2.setBounds(50,100,200,200);
			if(t2 % 2 ==  0) b2.setIcon(new ImageIcon("E:\\Swing\\OIP2.jfif"));
			else b2.setIcon(new ImageIcon("E:\\Swing\\OIP.jfif"));
			t2++;
		}
	}
	
	JButtonExample(){
		
		JFrame f = new JFrame("JButton Example");
		b = new JButton("Click me");
		b2 = new JButton(new ImageIcon("E:\\Swing\\OIP.jfif"));
		b.setBounds(50,50,100,30);
		b2.setBounds(50,100,200,200);
		b.addActionListener(this);
		b2.addActionListener(this);
		f.add(b);
		f.add(b2);
		f.setSize(350,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new JButtonExample();

	}

}
