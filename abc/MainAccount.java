package abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class MainAccount extends JFrame {

	private JPanel contentPane;
	private JTextPane textField;
	private JTextPane passwordField;
	private JTextPane textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAccount frame = new MainAccount();
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
	public MainAccount() {
		setBounds(100, 100, 1400, 830);
//		frame.setMaximizedBounds(null);
//	    frame.setVisible(true);
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("E-Mail");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Californian FB", Font.PLAIN, 23));
		lblNewLabel_2_1_1.setBounds(471, 490, 117, 37);
		layeredPane.add(lblNewLabel_2_1_1);
		
		JTextPane textField_1_1 = new JTextPane();
		textField_1_1.setForeground(Color.WHITE);
		textField_1_1.setBackground(Color.BLACK);
		textField_1_1.setBounds(598, 490, 219, 30);
		layeredPane.add(textField_1_1);
		
		textField_1 = new JTextPane();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(598, 422, 219, 30);
		layeredPane.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contact No.");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Californian FB", Font.PLAIN, 23));
		lblNewLabel_2_1.setBounds(471, 422, 117, 37);
		layeredPane.add(lblNewLabel_2_1);
		
		
		JButton btnNewButton = new JButton("Home Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainHomepage s = new MainHomepage();
				s.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Californian FB", Font.PLAIN, 23));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(586, 683, 183, 37);
		layeredPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Update \u200CInfo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MainLogin.setVisible(false);
				MainAddress s = new MainAddress();
				s.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Californian FB", Font.PLAIN, 23));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(586, 612, 183, 37);
		layeredPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome \n To Your Profile");
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(508, 47, 333, 102);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Californian FB", Font.PLAIN, 23));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(471, 208, 117, 37);
		layeredPane.add(lblNewLabel_2);
		
		textField = new JTextPane();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setBounds(598, 167, 219, 30);
		layeredPane.add(textField);
//		
		passwordField = new JTextPane();
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(598, 215, 217, 165);
		layeredPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Californian FB", Font.PLAIN, 23));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(471, 160, 131, 37);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Login.png"));
		lblNewLabel.setBounds(-15, 0, 1556, 791);
		layeredPane.add(lblNewLabel);
		
//		textField = new JTextField();
//		textField.setBounds(649, 269, 86, 20);
//		layeredPane.add(textField);
//		textField.setColumns(10);
//		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(649, 346, 7, 20);
//		layeredPane.add(passwordField);
		
	
		
		
		
		
	}
}
