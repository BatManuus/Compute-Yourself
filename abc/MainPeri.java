package abc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;

public class MainPeri extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPeri frame = new MainPeri();
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
	public MainPeri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		
//		JLabel pic = new JLabel("");
//		    Timer tm;
//		    int x = 0;
//		    //Images Path In Array
//		    String[] list = {
//		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\RTX 3090.png",
//		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\AMD R9 5900x.png",
//		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\ROG Maximus.png",
//		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\thermaltake psu.png",
//		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\Corsair Case.png",
//		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\Ripjaws DDR3.png"	                   
//	                         };
//		    
//		    public void MainPeri(){
//		        super("Java SlideShow");
//		        Component pic = new JLabel();
//		        pic.setBounds(40, 30, 700, 300);
//
//		        //Call The Function SetImageSize
//		        SetImageSize(6);
//		               //set a timer
//		        Timer tm = new Timer(500,new ActionListener() {
//
//		            @Override
//		            public void actionPerformed(ActionEvent e) {
//		                SetImageSize(x);
//		                x += 1;
//		                if(x >= list.length )
//		                    x = 0; 
//		            }
//		        });
//		        add(pic);
//		        tm.start();
//		        setLayout(null);
//		        setSize(800, 400);
//		        getContentPane().setBackground(Color.decode("#bdb67b"));
//		        setLocationRelativeTo(null);
//		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		        setVisible(true);
//		    }
//		    //create a function to resize the image 
//		    public void SetImageSize(int i){
//		        ImageIcon icon = new ImageIcon(list[i]);
//		        Image img = icon.getImage();
//		        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
//		        ImageIcon newImc = new ImageIcon(newImg);
//		        pic.setIcon(newImc);
//		    }
//
//		public static void main(String[] args){ 
//		      
//		    new MainPeri();
//		
//		}
		
 

	    

		
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3_1 = new JLabel("PSU                         Display                      Chasis                      Storage\r\n");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Californian FB", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(102, 595, 762, 29);
		layeredPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("CPU                  Motherboard                  RAM                          GPU");
		lblNewLabel_3.setFont(new Font("Californian FB", Font.BOLD, 25));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(113, 342, 762, 29);
		layeredPane.add(lblNewLabel_3);
		
		
		
		
		
		JButton btnNewButton = new JButton("Back To Home");
		btnNewButton.setBounds(986, 33, 116, 29);
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
//		btnNewButton.setBounds(39, 42, 141, 33);
//		btnNewButton.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		layeredPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Peripherals");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD, 30));
		lblNewLabel_1.setBounds(35, 37, 187, 64);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Mini Logo.png"));
		lblNewLabel_2.setBounds(508, 0, 200, 101);
		layeredPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\processor big.png"));
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(51, 169, 167, 162);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\motherboard big.png"));
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(259, 169, 167, 162);
		layeredPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\video_card big.png"));
		btnNewButton_1_1_1.setOpaque(false);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1_1.setBounds(673, 169, 167, 162);
		layeredPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\memory big.png"));
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(465, 169, 167, 162);
		layeredPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\power_supply big.png"));
		btnNewButton_1_3.setOpaque(false);
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_3.setFocusPainted(false);
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(Color.BLACK);
		btnNewButton_1_3.setBounds(51, 422, 167, 162);
		layeredPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\display big.png"));
		btnNewButton_1_1_2.setOpaque(false);
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_1_2.setFocusPainted(false);
		btnNewButton_1_1_2.setContentAreaFilled(false);
		btnNewButton_1_1_2.setBorderPainted(false);
		btnNewButton_1_1_2.setBorder(null);
		btnNewButton_1_1_2.setBackground(Color.BLACK);
		btnNewButton_1_1_2.setBounds(259, 422, 167, 162);
		layeredPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\ssdsata big.png"));
		btnNewButton_1_1_1_1.setOpaque(false);
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1_1.setBorder(null);
		btnNewButton_1_1_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1_1_1.setBounds(673, 422, 167, 162);
		layeredPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\chasis big.png"));
		btnNewButton_1_2_1.setOpaque(false);
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Californian FB", Font.BOLD, 35));
		btnNewButton_1_2_1.setFocusPainted(false);
		btnNewButton_1_2_1.setContentAreaFilled(false);
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.setBorder(null);
		btnNewButton_1_2_1.setBackground(Color.BLACK);
		btnNewButton_1_2_1.setBounds(465, 422, 167, 162);
		layeredPane.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Back 1.jpg"));
		lblNewLabel.setBounds(0, 0, 1374, 781);
		layeredPane.add(lblNewLabel);
		
	}

}
