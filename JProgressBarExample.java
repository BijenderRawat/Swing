package components;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarExample {
	
	JFrame f;
	JProgressBar jb;  
	
	JProgressBarExample(){
		
		f = new JFrame();
		jb = new JProgressBar(0,100);
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		jb.setOrientation(JProgressBar.VERTICAL);
		jb.setStringPainted(true);
		f.add(jb);    
		f.setSize(250,150);    
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}    
	
	public void iterate(){
		
		int i = 0;
		while(i <= 100){    
			jb.setValue(i);    
			i++;
			try{Thread.sleep(1500);}catch(Exception e){}    
		}
		
	}    

	public static void main(String[] args) {
		
		new JProgressBarExample().iterate();

	}

}
