package abc;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

public class MainSignup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainSignup frame = new MainSignup();
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
	public MainSignup() {
		setBounds(100, 100, 1400, 830);
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton btnBackYoLogin = new JButton("Back To Log-In");
		btnBackYoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin s = new MainLogin();
				s.show();
				dispose();
			}
		});
		btnBackYoLogin.setForeground(Color.WHITE);
		btnBackYoLogin.setFont(new Font("Californian FB", Font.PLAIN, 24));
		btnBackYoLogin.setBackground(Color.BLACK);
		btnBackYoLogin.setBounds(599, 572, 184, 37);
		layeredPane.add(btnBackYoLogin);
		
		
		JLabel lblNewLabel_1 = new JLabel("Sign-Up To Compute Yourself ");
		lblNewLabel_1.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(535, 47, 322, 46);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(471, 156, 113, 29);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(471, 395, 156, 29);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact Number");
		lblNewLabel_4.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(471, 230, 166, 29);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Email-id");
		lblNewLabel_6.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(471, 315, 156, 29);
		layeredPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField.setBounds(645, 158, 196, 25);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(Color.BLACK);
		textField_2.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_2.setBounds(647, 232, 197, 25);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setBackground(Color.BLACK);
		textField_3.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_3.setBounds(645, 317, 196, 25);
		layeredPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setBackground(Color.BLACK);
		textField_4.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_4.setBounds(645, 395, 196, 29);
		layeredPane.add(textField_4);
		
		
		JButton btnNewButton = new JButton("Sign-Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String name = textField.getText();
			String contact = textField_2.getText();
			String	email_id = textField_3.getText();
//			@SuppressWarnings("deprecation")
			String	password = textField_4.getText();
								try
							    {
									Class.forName("com.mysql.cj.jdbc.Driver");	
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/computeyourself","root","rugved");
					
							        String query = " insert into user ( name , email_id , password , contact) values (?, ?, ?, ?)";
							        
							        

							      PreparedStatement preparedStmt = con.prepareStatement(query);
							      preparedStmt.setString (1, name);
							      preparedStmt.setString (2, email_id);
							      preparedStmt.setString (3, password);
							      preparedStmt.setString (4,contact);
//							      preparedStmt.execute();
//							      ResultSet rs=preparedStmt.executeQuery('');
							      int rows = preparedStmt.executeUpdate();
							     
							      if(rows>0)
							     
							      
							      //move from one frame to another using if else 
							        {
								MainHomepage s = new MainHomepage();
								s.show();
								dispose();	  
							   
							    }
							      else	
							    	  
							      {
							    	 
							    	  textField.setText(" ");
							    	  textField_2.setText(" ");
							    	  textField_3.setText(" ");
							    	  textField_4.setText(" ");
							    	  JOptionPane.showMessageDialog(null,"Sign in Unsuccessful" );
							      }
							       }
							    	  
							    	  
							    catch (Exception e1)
							    {
							    	e1.printStackTrace(); 
							    }
							  }
		});	
							
				
//				MainHomepage s = new MainHomepage();
//				s.show();
//				dispose();
//			}
		
		btnNewButton.setFont(new Font("Californian FB", Font.PLAIN, 24));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(599, 487, 184, 37);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Login.png"));
		lblNewLabel.setBounds(0, 0, 1384, 791);
		layeredPane.add(lblNewLabel);
		

		
	}


		
	
//
//	public void setVisible(boolean b) {
//	}
	}
		 
		
	

	
		
	


