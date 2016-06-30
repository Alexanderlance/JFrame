package frame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("just for practice");
		frame.setLayout(new GridLayout(3, 5, 4, 4));
		for(int i=0;i<12;i++){
			frame.add(new JButton("°´Å¥-"+(i+1)));
			
		}
		frame.pack();
		frame.setVisible(true);
	}

}
