package abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainHomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainHomepage frame = new MainHomepage();
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
	public MainHomepage() {
		setFont(new Font("Californian FB", Font.BOLD, 30));
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1400, 830);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPeri s = new MainPeri();
				s.show();
				dispose();
			}
		});
		btnNewButton_3.setBounds(119, 659, 189, 41);
		btnNewButton_3.setForeground(SystemColor.text);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		layeredPane.add(btnNewButton_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("FAQ                               Account");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Californian FB", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(1150, 70, 189, 32);
		layeredPane.add(lblNewLabel_4);
		
		
		
		JButton btnNewButton = new JButton("PRODUCTS");
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(119, 25, 228, 54);
		layeredPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Mini Logo.png"));
		lblNewLabel_1.setBounds(591, 0, 200, 108);
		layeredPane.add(lblNewLabel_1);
		
//		JButton btnNewButton_3 = new JButton("");
//		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\BatManus\\Desktop\\Compute Yourself\\Daco_2446360.png"));
//		btnNewButton_3.setBounds(10, 368, 89, 83);
//		btnNewButton_3.setFocusPainted(false);
//		btnNewButton_3.setBorder(null);
//		btnNewButton_3.setOpaque(false);
//		btnNewButton_3.setContentAreaFilled(false);
//		btnNewButton_3.setBorderPainted(false);
//		layeredPane.add(btnNewButton_3);
//		
//		JButton btnNewButton_4 = new JButton("");
//		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\BatManus\\Desktop\\Compute Yourself\\Daco_2446360 - Copy.png"));
//		btnNewButton_4.setBounds(1299, 368, 75, 83);
//		btnNewButton_4.setFocusPainted(false);
//		btnNewButton_4.setBorder(null);
//		btnNewButton_4.setOpaque(false);
//		btnNewButton_4.setContentAreaFilled(false);
//		btnNewButton_4.setBorderPainted(false);
//		layeredPane.add(btnNewButton_4);
//		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainAccessories s = new MainAccessories();
				s.show();
				dispose();
			}
		});
		comboBox.setFont(new Font("Californian FB", Font.PLAIN, 24));
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Accessories", "Keyboard", "Mouse", "Headset", "Gaming-Pad", "External Storage"}));
		comboBox.setBounds(392, 107, 157, 41);
		comboBox.setBorder(null);
		layeredPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPeri s = new MainPeri();
				s.show();
				dispose();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Peripherals", "CPU", "Graphic Card", "Motherboard", "Power Supply", "Storage", "Ram", "Colling System", "PC Case", "Monitor"}));
		comboBox_1.setBackground(Color.BLACK);
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Californian FB", Font.PLAIN, 24));
		comboBox_1.setBounds(617, 107, 163, 41);
		layeredPane.add(comboBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainBYO s = new MainBYO();
				s.show();
				dispose();
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Build Your Own PC", "Heavy Editing", "Gaming And Editing", "School", "Home"}));
		comboBox_3.setBackground(Color.BLACK);
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setFont(new Font("Californian FB", Font.PLAIN, 24));
		comboBox_3.setBounds(853, 107, 250, 41);
		layeredPane.add(comboBox_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try{
				    browser.browse(new URI("https://computeyourselffaq.blogspot.com/"));
//				    Desktop.getdesktop().browser(new URL("https://computeyourselffaq.blogspot.com/").toURI());
				}
				catch(IOException err)
				{}
				catch(URISyntaxException err)
				{}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\Desktop\\Compute Yourself\\Icons\\Search.png"));
		btnNewButton_1.setBounds(1115, 11, 89, 68);
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainAccount s = new MainAccount();
				s.show();
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\Desktop\\Compute Yourself\\Icons\\White Man.png"));
		btnNewButton_2.setBounds(1251, 11, 89, 68);
		btnNewButton_2.setForeground(SystemColor.text);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		layeredPane.add(btnNewButton_2);
//		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Intel 1.jpg"));
		lblNewLabel_3.setBounds(34, 202, 1030, 578);
		layeredPane.add(lblNewLabel_3);
		
	
		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Back 2.jpg"));
		lblNewLabel.setBounds(0, 0, 1384, 791);
		layeredPane.add(lblNewLabel);
		
		
		
		
	}
}