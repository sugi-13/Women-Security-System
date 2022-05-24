package miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Exception;



//create login class to create login
class Createlogin extends JFrame implements ActionListener{
	JButton b;
	JPanel newPanel;
	JLabel userlabel , passlabel;
	final JTextField textField1 , textField2;
	//constructor
	Createlogin(){
		//label for username
		userlabel = new JLabel();
		userlabel.setText("USERNAME");
		textField1 = new JTextField(20);
		//label for password
		passlabel = new JLabel();
		passlabel.setText("PASSWORD");
		textField2 = new JTextField(20);
		//submit button
		b = new JButton("SUBMIT");
		//panel for form elements
		newPanel = new JPanel(new GridLayout(3,1));
		newPanel.add(userlabel);
		newPanel.add(textField1);
		newPanel.add(passlabel);
		newPanel.add(textField2);
		newPanel.add(b);
		//border for panel
		add(newPanel,BorderLayout.CENTER);
		//performing action - onclick button
		b.addActionListener(this);
		setTitle("LOGIN FORM");
	}
	//defining abstract method for button performance onclick
	public void actionPerformed(ActionEvent ae) {//passing action listener as parameter
		String uservalue = textField1.getText();
		String passvalue = textField2.getText();
		//checking whether the credentials are correct
		if(uservalue.equals("Newuser")&&passvalue.equals("demopass")) {
			NewPage page = new NewPage();
			page.setVisible(true);
			JLabel WelLabel = new JLabel("Welcome "+uservalue);
			page.getContentPane().add(WelLabel);
		}
		else {
			System.out.println("enter valid username and password");
		}
	}
	
	
}
class LoginForm {
	public static void main(String args[]) {
		try {
			Createlogin form = new Createlogin();
			form.setSize(300,100);
			form.setVisible(true);			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}

}


