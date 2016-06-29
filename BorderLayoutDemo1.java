package frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("just for practice");
		frame.setLayout(new BorderLayout(3,3));
		frame.add(new JButton("east"),BorderLayout.EAST);
		frame.add(new JButton("west"),BorderLayout.WEST);
		frame.add(new JButton("south"),BorderLayout.SOUTH);
		frame.add(new JButton("north"),BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
		
	}

}
