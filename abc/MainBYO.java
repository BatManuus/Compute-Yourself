package abc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainBYO extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBYO frame = new MainBYO();
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
	public MainBYO() {
		setFont(new Font("Californian FB", Font.BOLD, 30));
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1400, 830);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton_2_1 = new JButton("BUY NOW");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Californian FB", Font.PLAIN, 17));
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(108, 634, 160, 33);
		layeredPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\min 1.png"));
		lblNewLabel_4.setBounds(143, 215, 125, 81);
		layeredPane.add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Mini Logo.png"));
		lblNewLabel_1.setBounds(571, 11, 223, 103);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\min 2.png"));
		lblNewLabel_5.setBounds(637, 220, 84, 76);
		layeredPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\min 3.png"));
		lblNewLabel_6.setBounds(1153, 215, 84, 76);
		layeredPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Back  To Home");
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
		btnNewButton.setBounds(39, 42, 141, 33);
//		btnNewButton.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
//		btnNewButton.setOpaque(false);
//		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Home/School Use");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Californian FB", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(1128, 302, 152, 23);
		layeredPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("High-End Gaming");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Californian FB", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(133, 307, 160, 23);
		layeredPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("High-End Editing");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Californian FB", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(613, 307, 147, 23);
		layeredPane.add(lblNewLabel_9);
		
		JTextPane txtpnCpuAmd = new JTextPane();
		txtpnCpuAmd.setForeground(Color.WHITE);
		txtpnCpuAmd.setFont(new Font("Californian FB", Font.PLAIN, 19));
		txtpnCpuAmd.setBackground(new Color(64, 64, 64));
		txtpnCpuAmd.setText("*Recommended\r\n\r\nCPU : AMD Ryzen 5 3600X \r\nGPU : RTX 3070 \r\nRAM : 16*2 DDR4 3200MHz \r\nPSU : EVGA SuperNova 800W \r\nMotherboard : MSI B450 Gaming Plus \r\nStorage : 2 TB HDD // 1 TB NVMe SSD \r\nCase :Thermaltake  Versa H22 \r\n\r\n");
		txtpnCpuAmd.setBounds(64, 375, 307, 199);
		txtpnCpuAmd.setOpaque(false);
		layeredPane.add(txtpnCpuAmd);
		
		JTextPane txtpnCpuAmd_1 = new JTextPane();
		txtpnCpuAmd_1.setText("*Recommended\r\n\r\nCPU : AMD Ryzen 9 3950X \r\nGPU : RTX 3090\r\nRAM : 32*2 DDR4 3200MHz \r\nPSU : EVGA SuperNova 1000W \r\nMotherboard : Asus  RoG STRIX X570E \r\nStorage : 4 TB HDD // 8 TB NVMe SSD \r\nCase :Corsair Carbide 678C ATX\r\n\r\n");
		txtpnCpuAmd_1.setOpaque(false);
		txtpnCpuAmd_1.setForeground(Color.WHITE);
		txtpnCpuAmd_1.setFont(new Font("Californian FB", Font.PLAIN, 19));
		txtpnCpuAmd_1.setBackground(Color.DARK_GRAY);
		txtpnCpuAmd_1.setBounds(528, 375, 320, 199);
		layeredPane.add(txtpnCpuAmd_1);
		
		JTextPane txtpnCpuAmd_2 = new JTextPane();
		txtpnCpuAmd_2.setText("*Recommended\r\n\r\nCPU : AMD Athlon 3000G\r\nGPU :  GTX 1050ti\r\nRAM : 8GB DDR4 3200MHz \r\nPSU : Corsair 450W \r\nMotherboard : Gigabyte B450M DS3H \r\nStorage : 1 TB HDD // 240GB SSD \r\nCase :Corsair Carbide 110i\r\n\r\n");
		txtpnCpuAmd_2.setOpaque(false);
		txtpnCpuAmd_2.setForeground(Color.WHITE);
		txtpnCpuAmd_2.setFont(new Font("Californian FB", Font.PLAIN, 19));
		txtpnCpuAmd_2.setBackground(Color.DARK_GRAY);
		txtpnCpuAmd_2.setBounds(1033, 375, 307, 199);
		layeredPane.add(txtpnCpuAmd_2);
		
		JButton btnNewButton_1 = new JButton("Select Your Own Parts");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainDIY s = new MainDIY();
				s.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Californian FB", Font.PLAIN, 24));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(547, 733, 286, 47);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BUY NOW");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Californian FB", Font.PLAIN, 17));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(600, 634, 160, 33);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BUY NOW");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Californian FB", Font.PLAIN, 17));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(1113, 634, 170, 33);
		layeredPane.add(btnNewButton_3);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Shiny Black.jpg"));
		lblNewLabel_2.setBounds(39, 215, 359, 507);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(502, 215, 359, 507);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Shiny Black.jpg"));
		layeredPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(1003, 215, 359, 507);
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Shiny Black.jpg"));
		layeredPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("Build Your Own PC");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Californian FB", Font.BOLD, 46));
		lblNewLabel_3.setBounds(482, 149, 411, 54);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Main Back.jpg"));
		lblNewLabel.setBounds(0, 0, 1384, 791);
		layeredPane.add(lblNewLabel);
		
		
	
		
		
		
		
		
		
		
	}
}
