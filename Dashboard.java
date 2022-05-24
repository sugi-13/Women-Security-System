package miniproject;
import javax.swing.*;    

public class Dashboard {
	public static void main(String[] args) {  
	    JFrame f=new JFrame("Dashboard");  
	    /*JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30); 
	    f.add(b);*/ 
	    JButton b1=new JButton("Here");  
	    b1.setBounds(50,100,95,30); 
	    f.add(b1); 
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	} 
}
