package frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AbsoluteLayoutDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("just for practice");
		frame.setLayout(null);
		JLabel title=new JLabel("practice absolutelayout");
		JButton enter=new JButton("enter");
		JButton help=new JButton("help");
		frame.setSize(200,90);
		title.setBounds(30,5,150,20);
		enter.setBounds(10,30,80,20);
		help.setBounds(100,30,80,20);
		frame.add(title);
		frame.add(enter);
		frame.add(help);
		frame.setVisible(true);
	}

}
