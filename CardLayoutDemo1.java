package frame;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CardLayoutDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("just foro practice");
		Container c=frame.getContentPane();
		CardLayout card=new CardLayout();
		frame.setLayout(card);
		c.add(new JLabel("标签-1", JLabel.CENTER),"first");
		c.add(new JLabel("标签-2", JLabel.CENTER),"second");
		c.add(new JLabel("标签-3", JLabel.CENTER),"third");
		c.add(new JLabel("标签-4", JLabel.CENTER),"fourth");
		frame.pack();
		frame.setVisible(true);
		card.show(c,"first");
		for(int i=0;i<4;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			card.next(c);
		}
	}

}
