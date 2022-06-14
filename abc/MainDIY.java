package abc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainDIY extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDIY frame = new MainDIY();
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
	public MainDIY() {
		setFont(new Font("Californian FB", Font.BOLD, 30));
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1400, 830);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.BLACK);
		comboBox.setBounds(541, 230, 284, 37);
		layeredPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Mini Logo.png"));
		lblNewLabel_1.setBounds(636, -13, 217, 135);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BUILD YOUR OWN PC");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Californian FB", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(613, 133, 264, 46);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\processor copy.png"));
		lblNewLabel_4.setBounds(452, 223, 42, 53);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\video_card copy.png"));
		lblNewLabel_4_1.setBounds(452, 297, 42, 53);
		layeredPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\memory copy.png"));
		lblNewLabel_4_2.setBounds(452, 375, 42, 53);
		layeredPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\motherboard copy.png"));
		lblNewLabel_4_3.setBounds(452, 456, 42, 53);
		layeredPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\power_supply copy.png"));
		lblNewLabel_4_4.setBounds(452, 536, 42, 53);
		layeredPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("");
		lblNewLabel_4_5.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\ssdsata copy.png"));
		lblNewLabel_4_5.setBounds(452, 618, 42, 53);
		layeredPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("");
		lblNewLabel_4_6.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\chassis copy.png"));
		lblNewLabel_4_6.setBounds(452, 700, 42, 53);
		layeredPane.add(lblNewLabel_4_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(Color.BLACK);
		comboBox_1.setBounds(541, 305, 284, 37);
		layeredPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBackground(Color.BLACK);
		comboBox_2.setBounds(541, 380, 284, 37);
		layeredPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setBackground(Color.BLACK);
		comboBox_3.setBounds(541, 461, 284, 37);
		layeredPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setForeground(Color.WHITE);
		comboBox_4.setBackground(Color.BLACK);
		comboBox_4.setBounds(541, 541, 284, 37);
		layeredPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setForeground(Color.WHITE);
		comboBox_5.setBackground(Color.BLACK);
		comboBox_5.setBounds(541, 623, 284, 37);
		layeredPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setForeground(Color.WHITE);
		comboBox_6.setBackground(Color.BLACK);
		comboBox_6.setBounds(541, 705, 284, 37);
		layeredPane.add(comboBox_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Main PC.png"));
		lblNewLabel_3.setBounds(35, 95, 356, 292);
		layeredPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.setFont(new Font("Californian FB", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(985, 712, 89, 23);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back To Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainHomepage s = new MainHomepage();
				s.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Californian FB", Font.PLAIN, 14));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(35, 35, 149, 23);
		layeredPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Back 1.jpg"));
		lblNewLabel.setBounds(0, 0, 1384, 791);
		layeredPane.add(lblNewLabel);
		
		
		
		
		
	}
}
