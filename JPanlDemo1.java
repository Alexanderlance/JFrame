package cn.edu.nuc.jpanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanlDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		JPanel jpanel=new JPanel();
		jpanel.add(new JLabel("label1"));
		jpanel.add(new JLabel("label2"));
		jpanel.add(new JLabel("label3"));
		jpanel.add(new JButton("button1"));
		jpanel.add(new JButton("button2"));
		jpanel.add(new JButton("button3"));
		frame.add(jpanel);
		frame.setVisible(true);
		frame.pack();
		frame.setLocation(300,200);//set windows location 
	}

}
