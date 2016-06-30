package cn.edu.nuc.jpanel;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class JSplitPanelDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("jst for practice");
		Container c=frame.getContentPane();
//		JSplitPanelDemo1 jsp=new JSplitPanelDemo1();
		JSplitPane l=null;
		JSplitPane r=null;
		l = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JLabel("llabel"),new JLabel("rlabel"));
		r=new JSplitPane(JSplitPane.VERTICAL_SPLIT, l, new JButton("downbutton"));
		r.setDividerSize(10);
		r.setOneTouchExpandable(true);
		c.add(r);
		frame.setSize(230, 80);
		frame.setLocation(300, 200);
		frame.setVisible(true);

	}

}
