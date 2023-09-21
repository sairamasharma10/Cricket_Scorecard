import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class newbat {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newbat window = new newbat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newbat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wicket Method");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 34, 111, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox list = new JComboBox();
		list.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		list.setModel(new DefaultComboBoxModel(new String[] {"Bowled", "Caught", "RunOut Striker", "LBW", "Runout NonStriker", "Stumping"}));
		list.setBounds(135, 37, 174, 21);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_1 = new JLabel("New Batsman");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(23, 84, 111, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		text = new JTextField();
		text.setBounds(135, 89, 174, 19);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JButton done = new JButton("Done");
		done.setFont(new Font("Times New Roman", Font.BOLD, 14));
		done.setBounds(112, 136, 93, 27);
		frame.getContentPane().add(done);
	}
}
