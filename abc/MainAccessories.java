package abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class MainAccessories extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
					 MainAccessories frame = new MainAccessories();
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
	public MainAccessories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		Image img1 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Main Back.jpg")).getImage();
//		Image img2 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\White Man.png")).getImage();
//		Image img3 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Cart.png")).getImage();
//		Image img4 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\filter.png")).getImage();
//		Image img5 = new ImageIcon(this.getClass().getResource("/wishlist (1).png")).getImage();
//		Image img6 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\mouse.png")).getImage();
//		Image img7 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\keyboard.png")).getImage();
//		Image img8 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Headphones.png")).getImage();
//		Image img9 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\ssd (1).png")).getImage();
//		Image img10 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\webcam (1).png")).getImage();
//		Image img11 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Mousebutton.png")).getImage();
//		Image img12 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Keyboardbutton.png")).getImage();
//		Image img13 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Headphonesbutton.png")).getImage();
//		Image img14 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Storagebutton.png")).getImage();
//		Image img15 = new ImageIcon(this.getClass().getResource("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Webcamsbutton.png")).getImage();
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ACCESSORIES");
		lblNewLabel_1.setBounds(70, 25, 250, 50);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back To Home");
		btnNewButton.setBounds(1100, 25, 130, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainHomepage s = new MainHomepage();
				s.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Californian FB", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
//		btnNewButton.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
//		btnNewButton.setOpaque(false);
//		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		contentPane.add(btnNewButton);
		
		JButton b0 = new JButton("");
		b0.setBounds(1020, 15, 50, 50);
//		b0.setIcon(new ImageIcon(img5));
		b0.setOpaque(false);
		b0.setForeground(Color.WHITE);
		b0.setFont(new Font("Californian FB", Font.BOLD, 35));
		b0.setFocusPainted(false);
		b0.setContentAreaFilled(false);
		b0.setBorderPainted(false);
		b0.setBorder(null);
		b0.setBackground(Color.BLACK);
		contentPane.add(b0);
		
		JButton b1 = new JButton("");
		b1.setBounds(1100, 15, 50, 50);
//		b1.setIcon(new ImageIcon(img3));
		b1.setOpaque(false);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Californian FB", Font.BOLD, 35));
		b1.setFocusPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setBorder(null);
		b1.setBackground(Color.BLACK);
		contentPane.add(b1);
		
		JButton b2 = new JButton("");
		b2.setBounds(1180, 15, 50, 50);
//		b2.setIcon(new ImageIcon(img2));
		b2.setForeground(SystemColor.text);
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Californian FB", Font.BOLD, 35));
		b2.setFocusPainted(false);
		b2.setBorder(null);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		contentPane.add(b2);
		
		JButton b3 = new JButton("");
		b3.setBounds(940, 15, 50, 50);
//		b3.setIcon(new ImageIcon(img4));
		b3.setForeground(SystemColor.text);
		b3.setBackground(Color.BLACK);
		b3.setFont(new Font("Californian FB", Font.BOLD, 35));
		b3.setFocusPainted(false);
		b3.setBorder(null);
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		contentPane.add(b3);
		
		JButton b5 = new JButton("");
//		b5.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				b5.setIcon(new ImageIcon(img15));
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				b5.setIcon(new ImageIcon(img10));
//			}
//		});
		b5.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\webcam (1).png"));
		b5.setOpaque(false);
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Californian FB", Font.BOLD, 35));
		b5.setFocusPainted(false);
		b5.setContentAreaFilled(false);
		b5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b5.setBackground(Color.WHITE);
		b5.setBounds(740, 400, 250, 250);
		contentPane.add(b5);
		
		JButton b6 = new JButton("");
//		b6.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				b6.setIcon(new ImageIcon(img14));
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				b6.setIcon(new ImageIcon(img9));
//			}
//		});
		b6.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\pngegg.png"));
		b6.setOpaque(false);
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("Californian FB", Font.BOLD, 35));
		b6.setFocusPainted(false);
		b6.setContentAreaFilled(false);
		b6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b6.setBackground(Color.WHITE);
		b6.setBounds(312, 400, 250, 250);
		contentPane.add(b6);
		
		final JButton b7 = new JButton("");
//		b7.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				b7.setIcon(new ImageIcon(img13));
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				b7.setIcon(new ImageIcon(img8));
//			}
//		});
		b7.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Headphones.png"));
		b7.setOpaque(false);
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("Californian FB", Font.BOLD, 35));
		b7.setFocusPainted(false);
		b7.setContentAreaFilled(false);
		b7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b7.setBackground(Color.WHITE);
		b7.setBounds(976, 100, 250, 250);
		contentPane.add(b7);
		
		JButton b8 = new JButton("");
//		b8.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				b8.setIcon(new ImageIcon(img12));
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				b8.setIcon(new ImageIcon(img7));
//			}
//		});
		b8.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\keyboard.png"));
		b8.setOpaque(false);
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("Californian FB", Font.BOLD, 35));
		b8.setFocusPainted(false);
		b8.setContentAreaFilled(false);
		b8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b8.setBackground(Color.WHITE);
		b8.setBounds(564, 100, 255, 250);
		contentPane.add(b8);
		

		
		JButton b9 = new JButton("");
//		b9.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				b9.setIcon(new ImageIcon(img11));
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				b9.setIcon(new ImageIcon(img6));
//			}
//		});
		b9.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\mouse.png"));
		b9.setOpaque(false);
		b9.setForeground(Color.WHITE);
		b9.setFont(new Font("Californian FB", Font.BOLD, 35));
		b9.setFocusPainted(false);
		b9.setContentAreaFilled(false);
		b9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b9.setBackground(Color.WHITE);
		b9.setBounds(157, 100, 250, 250);
		contentPane.add(b9);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1384, 791);
		lblNewLabel.setFont(new Font("Californian FB", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Main Back.jpg"));
		contentPane.add(lblNewLabel);
		
	
	}
}
