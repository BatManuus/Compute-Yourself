package abc;

import javax.swing.*;

public class Scroll extends JFrame{
	JLabel label = new JLabel();
	JScrollPane scrollPane = new JScrollPane();
	
	public Scroll(){
		label.setIcon(new ImageIcon("C:\\Users\\BatManus\\eclipse-workspace\\Random\\src\\Photos\\Main Vertical.jpg"));
		scrollPane.setViewportView(label);
		add(scrollPane);
	}
	
	public static void main(String[] args) {
		Scroll sp = new Scroll();
		sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//sp.setSize(1024,800);
		sp.pack();
		sp.setVisible(true);
	}

}