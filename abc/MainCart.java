package abc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class MainCart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCart frame = new MainCart();
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
	public MainCart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(1100, 475, 100, 40);
		lblNewLabel_6_1.setFont(new Font("Californian FB", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6 = new JLabel("Checkout");
		lblNewLabel_6.setBounds(1045, 535, 100, 40);
		lblNewLabel_6.setFont(new Font("Californian FB", Font.PLAIN, 25));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("Total   :");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setBounds(968, 506, 80, 20);
		lblNewLabel_5_1.setFont(new Font("Californian FB", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("Grand");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(968, 475, 80, 20);
		lblNewLabel_5.setFont(new Font("Californian FB", Font.PLAIN, 21));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Summary :");
		lblNewLabel_4_1.setBounds(980, 110, 145, 50);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("Items :");
		lblNewLabel_4.setBounds(70, 110, 230, 50);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Californian FB", Font.BOLD, 30));
		contentPane.add(lblNewLabel_4);
		
		JButton checkout = new JButton("");
		checkout.setBounds(1035, 530, 121, 50);
		contentPane.add(checkout);
		
		JButton b2 = new JButton("");
		b2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\White Man.png"));
		b2.setBounds(1180, 15, 64, 60);
		b2.setForeground(SystemColor.text);
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Californian FB", Font.BOLD, 35));
		b2.setFocusPainted(false);
		b2.setBorder(null);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		contentPane.add(b2);
		
		JButton b1 = new JButton("");
		b1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Search.png"));
		b1.setBounds(1100, 15, 56, 60);
		b1.setOpaque(false);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Californian FB", Font.BOLD, 35));
		b1.setFocusPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setBorder(null);
		b1.setBackground(Color.BLACK);
		contentPane.add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("CART");
		lblNewLabel_1.setBounds(70, 25, 250, 50);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(960, 100, 269, 500);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\Desktop\\Compute Yourself\\418e1a67a6ff452f43a39a4d913dc540.jpg"));
		lblNewLabel_2.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1300, 700);
		lblNewLabel.setFont(new Font("Californian FB", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\Desktop\\Compute Yourself\\617a450c0aed8.jpg"));
		contentPane.add(lblNewLabel);
	}
}
