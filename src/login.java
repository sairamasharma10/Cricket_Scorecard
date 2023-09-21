import javax.swing.*;
import java.awt.event.*;
public class login {
	public static void main(String args[])
	{
		new k();
	}
	
}
class k extends JFrame
{
	k()
	{
		super("Login");
		JLabel j1 = new JLabel ("Login Page");
		this.add(j1);
		j1.setBounds(150,50,100,50);
		this.setLayout(null);
		
		
		
		JTextField k=new JTextField();
		k.setBounds(150,100,100,50);
		this.add(k);
		
		
		
		JTextField k1=new JTextField();
		k1.setBounds(150,150,100,50);
		this.add(k1);
		
		JTextField k3=new JTextField();
		k3.setBounds(350,150,200,50);
		this.add(k3);
		
		String z="Abhilash";
		String pass="1234567890";
		
		
		JButton but=new JButton("Submit");
		but.setBounds(150,200,100,50);
		this.add(but);
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(k.getText()==z && k1.getText()==pass)
				{
					k3.setText("SuccessFully Logined");
				}
				else
				{
					System.out.println(k1.getText());
					k3.setText("Authentication Failed");
				}
			}
		});
		
		JButton but1=new JButton("cancel");
		but1.setBounds(150,250,100,50);
		this .add(but1);
		
		but1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				k.setText("");
				k1.setText("");
			}
		});
		//textField()
		this.setSize(600,600);
		this.setVisible(true);
	}
}
