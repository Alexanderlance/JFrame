package frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("practice");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));
		JButton but=null;
		for(int i=0;i<9;i++){
			but=new JButton("°´Å¥-"+(i+1));
			frame.add(but);
		}
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
