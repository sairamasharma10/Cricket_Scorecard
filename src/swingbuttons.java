import javax.swing.*;
//import java.awt.color.*;
import java.awt.*;
import java.awt.event.*;
public class swingbuttons extends Frame implements ActionListener,ItemListener{
	JTextField jt1;
	JCheckBox jc1,jc2;
	JRadioButton jr1,jr2;
	
	swingbuttons(){
		
     jt1= new JTextField("SRU cse");
	jt1.setBounds(10,10,200,50);
	this.add(jt1);
	jc1=new JCheckBox("Bold");
	jc1.setBounds(250,10,100,100);
	this.add(jc1);
	jc1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try{
				if(jc1.isSelected()){
					jt1.setFont(new Font("",Font.BOLD,18));
				}
			}
			catch(Exception f){
				System.out.println(f);
			}
		}
	});
	JCheckBox jc2=new JCheckBox("Italic");
	jc2.setBounds(350,10,100,100);
	this.add(jc2);
	jc2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try{
				if(jc2.isSelected()){
					jt1.setFont(new Font("",Font.ITALIC,18));
				}
			}
			catch(Exception f){
				System.out.println(f);
			}
		}
	});
	
	JRadioButton jr1=new JRadioButton("lower");
	jr1.setBounds(450,10,100,100);
	jr1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				if(jr1.isSelected())
				{
					String k=jt1.getText();
					jt1.setText(k.toLowerCase());
				}
			}
			catch(Exception f)
			{
				System.out.println(f);
			}
		}
	});
	JRadioButton jr2=new JRadioButton("Upper");
	jr2.setBounds(550,10,100,100);
	jr2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try{
				if(jr2.isSelected()){
					String k=jt1.getText();
					jt1.setText(k.toUpperCase());
				}
			}
			catch(Exception f){
				System.out.println(f);
			}
		}
	});
	ButtonGroup bg=new ButtonGroup();
	bg.add(jr1);
	bg.add(jr2);
	
	this.add(jr1);
	this.add(jr2);
	
    this.setLayout(null);
	this.setSize(1000,1000);
	this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try {
		if(jr2.isSelected())
		{
			jt1.setText(jt1.getText().toUpperCase());
		}
	    }
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}			
	}

public static void main (String args[])
{
	new swingbuttons();
}
}