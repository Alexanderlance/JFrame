package frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class j1 extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField password;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					j1 frame = new j1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public j1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel username = new JLabel("\u7528\u6237\u540D\uFF1A");
		username.setBounds(60, 60, 65, 15);
		contentPane.add(username);
		
		JLabel pass = new JLabel("\u5BC6\u7801\uFF1A");
		pass.setBounds(60, 85, 65, 15);
		contentPane.add(pass);
		
		user = new JTextField();
		user.setBounds(114, 57, 208, 21);
		contentPane.add(user);
		user.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(114, 85, 208, 21);
		contentPane.add(password);
		
		JButton bt2 = new JButton("\u767B\u5F55");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("ysn".equals(user.getText())&&"123".equals(password.getText())){
					JOptionPane.showMessageDialog(null,"µÇÂ¼³É¹¦£¡" );
				}else{
					JOptionPane.showMessageDialog(null,"µÇÂ¼Ê§°Ü£¡" );
				}
			}
		});
		bt2.setBounds(229, 116, 93, 23);
		contentPane.add(bt2);
		
		JButton bt1 = new JButton("\u91CD\u7F6E");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText(null);
				password.setText(null);
			}
		});
		bt1.setBounds(114, 116, 93, 23);
		contentPane.add(bt1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
