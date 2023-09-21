import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
public class Tempf 
{
	public static void main(String args[])
	{
		new kk();
	}
}
class kk extends JFrame
{
	public JFrame frmBowlerChange;
	private JTextField textField;
	kk()
	{
		super("My First Frame Using Swing");
		JLabel j1 = new JLabel ("First_Number");
		this.add(j1);
		j1.setBounds(50,50,100,50);
		this.setLayout(null);
		
		
		
		JTextField k=new JTextField();
		k.setBounds(50,100,100,50);
		this.add(k);
		
		
		
		JLabel j2 = new JLabel ("Second_Number");
		this.add(j2);
		j2.setBounds(300,50,100,50);
		this.setLayout(null);
		
		
		JTextField k1=new JTextField();
		k1.setBounds(300,100,100,50);
		this.add(k1);
		
		JTextField k3=new JTextField();
		//k3.setBounds(50,300,100,50);
		k3.isEditable();
		this.add(k3);
		
		JTextField k4=new JTextField();
		k4.setBounds(300,300,100,50);
		this.add(k4);
		
		
		JButton but=new JButton("Add");
		but.setBounds(50,160,100,50);
		this.add(but);
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(k.getText());
				int m=Integer.parseInt(k1.getText());
				k3.setText(String.valueOf(n+m));
			}
		});
		
		JButton but1=new JButton("Subtract");
		but1.setBounds(300,160,100,50);
		this .add(but1);
		
		but1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(k.getText());
				int m=Integer.parseInt(k1.getText());
				k4.setText(String.valueOf(n-m));
			}
		});
		this.setSize(600,600);
		
		
		
		frmBowlerChange = new JFrame();
		frmBowlerChange.setFont(new Font("Dialog", Font.BOLD, 13));
		frmBowlerChange.setTitle("Bowler Change");
		frmBowlerChange.setBounds(100, 100, 354, 247);
		frmBowlerChange.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBowlerChange.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a New Bowler");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(35, 39, 172, 40);
		frmBowlerChange.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setBounds(35, 91, 271, 30);
		frmBowlerChange.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton done = new JButton("Done");
		done.setFont(new Font("Times New Roman", Font.BOLD, 14));
		done.setBounds(109, 156, 93, 27);
		frmBowlerChange.getContentPane().add(done);
	}
}
