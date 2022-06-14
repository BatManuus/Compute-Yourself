package abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
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
	public MainLogin() {
		setBounds(100, 100, 1400, 830);
//	    setMaximizedBounds(null);
//	    frame.setVisible(true);
//		setLocationRelativeTo(null);
//	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		textField_1 = new JTextField();
		//password
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(596, 334, 219, 30);
		layeredPane.add(textField_1);
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						try
						{
							Class.forName("com.mysql.cj.jdbc.Driver");
							
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/computeyourself","root","rugved");
							Statement stmt=con.createStatement();
							String sql="Select * from user where email_id='"+textField.getText()+"' and password='"+textField_1.getText().toString()+"'";
							ResultSet rs=stmt.executeQuery(sql);
							if(rs.next()) {
								MainHomepage t = new MainHomepage();
							t.show();
							dispose();
							}
//								JOptionPane.showMessageDialog(null, "Login Sucessful");
							//add code to move from login frame to home page frame.
							else
								JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
						}
					});
			
		btnNewButton.setFont(new Font("Californian FB", Font.PLAIN, 23));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(531, 435, 105, 37);
		layeredPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Sign-up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MainLogin.setVisible(false);
				MainSignup s = new MainSignup();
				s.show();
				dispose();
			}
		});
		
		
		btnNewButton_1.setFont(new Font("Californian FB", Font.PLAIN, 23));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(705, 435, 110, 37);
		layeredPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome \r\n To \r\nCompute Yourself");
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(471, 57, 452, 102);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Californian FB", Font.PLAIN, 23));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(471, 334, 117, 37);
		layeredPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		//email
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setBounds(596, 257, 219, 30);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email-id");
		lblNewLabel_3.setFont(new Font("Californian FB", Font.PLAIN, 23));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(471, 257, 131, 37);
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
