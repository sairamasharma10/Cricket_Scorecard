import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tosspage extends JFrame {

	private JPanel contentPane;
	private JTextField team1;
	private JTextField team2;
	private JTextField Overs;
	private tosspage tossFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tosspage frame = new tosspage();
					frame.setVisible(true);
					frame.tossFrame=frame;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tosspage() 
	{
		setTitle("TossPage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Team1");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 23, 46, 17);
		contentPane.add(lblNewLabel);
		
		team1 = new JTextField();
		team1.setColumns(10);
		team1.setBounds(146, 24, 157, 17);
		contentPane.add(team1);
		
		JLabel lblTeam = new JLabel("Team2");
		lblTeam.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTeam.setBounds(33, 64, 46, 17);
		contentPane.add(lblTeam);
		
		team2 = new JTextField();
		team2.setColumns(10);
		team2.setBounds(146, 65, 157, 17);
		contentPane.add(team2);
		
		JLabel overs = new JLabel("Number of Overs");
		overs.setFont(new Font("Times New Roman", Font.BOLD, 14));
		overs.setBounds(33, 103, 116, 25);
		contentPane.add(overs);
		
		Overs = new JTextField();
		Overs.setColumns(10);
		Overs.setBounds(146, 108, 157, 17);
		contentPane.add(Overs);
		
		JLabel lblTossWon = new JLabel("Toss Won");
		lblTossWon.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTossWon.setBounds(33, 148, 80, 25);
		contentPane.add(lblTossWon);
		
		JRadioButton team1toss = new JRadioButton("Team1");
		team1toss.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		team1toss.setBounds(146, 151, 113, 21);
		contentPane.add(team1toss);
		
		JRadioButton team2toss = new JRadioButton("Team2");
		team2toss.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		team2toss.setBounds(146, 190, 113, 21);
		contentPane.add(team2toss);
		
		JLabel lblOptedTo = new JLabel("Opted To?");
		lblOptedTo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblOptedTo.setBounds(33, 236, 80, 25);
		contentPane.add(lblOptedTo);
		
		JRadioButton batopt = new JRadioButton("Bat");
		batopt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		batopt.setBounds(146, 236, 113, 21);
		contentPane.add(batopt);
		
		JRadioButton bowlopt = new JRadioButton("Bowl");
		bowlopt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		bowlopt.setBounds(146, 274, 113, 21);
		contentPane.add(bowlopt);
		
		JButton start = new JButton("Start Match");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matchDetails md=new matchDetails();
				try 
				{
					boolean z=team1toss.isSelected();
					boolean y=batopt.isSelected();
					md.setData(team1.getText(),team2.getText(),Overs.getText(),z,y);
					System.out.println();
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
				
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Player_Entry frame = new Player_Entry(team1.getText(),team2.getText());
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				tossFrame.setVisible(false);
			}
		});
		start.setFont(new Font("Times New Roman", Font.BOLD, 12));
		start.setBounds(146, 314, 113, 34);
		contentPane.add(start);
	}
}
