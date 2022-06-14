package abc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Common extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Common frame = new Common();
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
	public Common() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		////////Slideshow Starts here
		
		
		int c=0;
//	    public static void main(String arg[]) throws InterruptedException {
	       
	    	
	    	JFrame Common = new JFrame("Login"); 
	        // creating a new frame
	       Common.setSize(700, 500);
	        JPanel addPanel = new JPanel();
	        final JLabel pic = new JLabel();

	        final Connection c1= new Connection();

	        String[] list = {
	        		
		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\Corsair Case.png",
		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\ROG Maximus.png",
		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\XPG Ram.png",
		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\RTX 3090.png",
		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\AMD R9 5900x.png",
		    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\thermaltake psu.png"
		    			};
	        pic.setBounds(40, 30, 500, 300);
	        JButton log = new JButton("SHOW");
	        final ImageIcon[] img  = new ImageIcon[6];
	        for(int time = 0;time < 6 ;time++) {
	            img[time]= new ImageIcon(list[time]);
	            }
	        addPanel.add(pic);
	        addPanel.add(log);
	        Common.getContentPane().add(addPanel);
	        Common.setVisible(true);
	        try {
	            log.addActionListener(new ActionListener() {
	                 public void actionPerformed(ActionEvent e) {
	                        Timer t  ;
	                     t= new Timer(2500,new ActionListener() {

	                            @Override
	                            public void actionPerformed(ActionEvent e) {
	                                if(c1.c<5) {


	                                    pic.setIcon(img[c1.c]);
	                                    c1.c++;
	                                    }}


	                            });
	                     t.start();
	                 }
	}
	);

	}catch(Exception ex)
	 {
	            System.out.println(ex.toString());

	}
	    
		
		
		////////
		JButton btnNewButton = new JButton("Back To Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainHomepage s = new MainHomepage();
				s.show();
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 155, 317, 305);
		layeredPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Californian FB", Font.BOLD, 15));
		btnNewButton.setBounds(1146, 32, 131, 30);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Mini Logo.png"));
		lblNewLabel_1.setBounds(653, 11, 227, 115);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Back 1.jpg"));
		lblNewLabel.setBounds(0, 0, 1374, 781);
		layeredPane.add(lblNewLabel);
	}
}
