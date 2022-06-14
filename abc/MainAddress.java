package abc;

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
import javax.swing.JTextPane;

public class MainAddress extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAddress frame = new MainAddress();
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

	public MainAddress() {
		setBounds(100, 100, 1400, 830);
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
	
		
		
		JLabel lblNewLabel_1 = new JLabel("Update Your Address\r\n");
		lblNewLabel_1.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(579, 47, 322, 46);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(471, 156, 166, 29);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pin-Code\r\n");
		lblNewLabel_3.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(471, 395, 156, 29);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(471, 277, 166, 29);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Street Name");
		lblNewLabel_5.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(471, 223, 156, 29);
		layeredPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("State");
		lblNewLabel_6.setFont(new Font("Californian FB", Font.PLAIN, 24));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(471, 336, 156, 29);
		layeredPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField.setBounds(645, 158, 196, 29);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(Color.BLACK);
		textField_1.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_1.setBounds(645, 220, 196, 29);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(Color.BLACK);
		textField_2.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_2.setBounds(645, 277, 196, 29);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setBackground(Color.BLACK);
		textField_3.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_3.setBounds(645, 336, 196, 29);
		layeredPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Californian FB", Font.PLAIN, 24));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.BLACK);
		textField_5.setBounds(645, 395, 196, 29);
		layeredPane.add(textField_5);
		
		
		JButton btnNewButton = new JButton("Save\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String address_line = textField.getText();
			String street_name = textField_1.getText();
			String	city = textField_2.getText();
			String	district = textField_3.getText();
			String	zipcode = textField_5.getText();
								
		try
	    {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/computeyourself","root","rugved");

	        String query = " insert into user_address ( address_line , street_name , city , district, zipcode) values (?, ?, ?, ?,?)";
	        
	        

	      PreparedStatement preparedStmt = con.prepareStatement(query);
	      preparedStmt.setString (1, address_line);
	      preparedStmt.setString (2, street_name);
	      preparedStmt.setString (3, city);
	      preparedStmt.setString (4,district);
	      preparedStmt.setString (5,zipcode);
	      preparedStmt.execute();
//	      ResultSet rs=preparedStmt.executeQuery('');
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
	    	  textField_1.setText(" ");
	    	  textField_2.setText(" ");
	    	  textField_3.setText(" ");
	    	  textField_5.setText(" ");
	    	  JOptionPane.showMessageDialog(null,"Invalid Address" );
	      }
	       }
	    	  
	    	  
	    catch (Exception e1)
	    {
	    	e1.printStackTrace(); 
	    }
	  }
});	

		btnNewButton.setFont(new Font("Californian FB", Font.PLAIN, 24));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(621, 487, 136, 37);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Login.png"));
		lblNewLabel.setBounds(0, 0, 1384, 791);
		layeredPane.add(lblNewLabel);
		

		
	}


		
	

 {
	}
	}
		 
		
	

	
		
	


