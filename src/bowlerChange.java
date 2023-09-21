import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bowlerChange {

	public JFrame frmBowlerChange;
	private JTextField textField;
	private bowlerChange flag;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					bowlerChange window = new bowlerChange();
					window.frmBowlerChange.setVisible(true);
					window.flag=window;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bowlerChange() 
	{
		int k=initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private String initialize() {
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
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag.frmBowlerChange.setVisible(false);
			}
		});
		done.setFont(new Font("Times New Roman", Font.BOLD, 14));
		done.setBounds(109, 156, 93, 27);
		frmBowlerChange.getContentPane().add(done);
		
		
	}

}
