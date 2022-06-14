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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;

public class Connection{
    
	
	int c=0;
    public static void main(String arg[]) throws InterruptedException {
       
    	
    	JFrame login = new JFrame("Login"); 
        // creating a new frame
        login.setSize(700, 500);
        JPanel addPanel = new JPanel();
        final JLabel pic = new JLabel();

        final Connection c1= new Connection();

        String[] list = {
        		
	    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\Corsair Case.png",
	    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\ROG Maximus.png",
	    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\Ripjaws DDR3.png",
	    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\RTX 3090.png",
	    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\AMD R9 5900x.png",
	    		"C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\products\\thermaltake psu.png",
	    		""
	    			};
        pic.setBounds(40, 30, 500, 300);
        JButton log = new JButton("SHOW");
        final ImageIcon[] img  = new ImageIcon[6];
        for(int time = 0;time < 6 ;time++) {
            img[time]= new ImageIcon(list[time]);
            }
        addPanel.add(pic);
        addPanel.add(log);
        login.add(addPanel);
        login.setVisible(true);
        try {
            log.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                        Timer t  ;
                     t= new Timer(5000,new ActionListener() {

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
    }
    }


