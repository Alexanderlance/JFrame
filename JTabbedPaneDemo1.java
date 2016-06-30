package cn.edu.nuc.jpanel;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("just for practice");
		Container c=frame.getContentPane();
		JTabbedPane tab=new JTabbedPane(JTabbedPane.TOP);
		JPanel j1=new JPanel();
		JPanel j2=new JPanel();
		JButton b=new JButton("button");
		JLabel j=new JLabel("label");
		j1.add(b);
		j2.add(j);
		tab.addTab("label", j);
		tab.addTab("button", b);
		c.add(tab);
		frame.setSize(230, 120);
		frame.setLocation(300, 200);
		frame.setVisible(true);
	}

}
