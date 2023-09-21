import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JList;
import javax.swing.JScrollPane;	
import java.awt.event.ActionEvent;

public class Player_Entry extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIn;
	private JTextField strike;
	private JLabel lblNonstrikingBatsman;
	private JTextField nonstrike;
	private JLabel lblOpeningBowler;
	private JTextField open;
	private Player_Entry temp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player_Entry frame = new Player_Entry(null,null);
					frame.setVisible(true);
					frame.temp=frame;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Player_Entry(String t1,String t2) {
		setTitle("Players Entry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Striking Batsman");
		lblNewLabel.setBounds(71, 100, 179, 27);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		txtIn = new JTextField();
		txtIn.setBounds(23, 28, 446, 48);
		txtIn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtIn.setEditable(false);
		contentPane.add(txtIn);
		txtIn.setColumns(10);
		txtIn.setBorder(null);
		
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> resultList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(resultList);
        contentPane.add(scrollPane);
        JTextField searchField = new JTextField();

		searchField.setBounds(371, 150, 275, 27);
		searchField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                search(searchField.getText(), listModel);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                search(searchField.getText(), listModel);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                search(searchField.getText(), listModel);
            }
        });
		contentPane.add(searchField);
		
		
		
		strike = new JTextField();
		strike.setBounds(71, 150, 275, 27);
		strike.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(strike);
		strike.setColumns(10);
		
		lblNonstrikingBatsman = new JLabel("NonStriking Batsman");
		lblNonstrikingBatsman.setBounds(71, 201, 179, 27);
		lblNonstrikingBatsman.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(lblNonstrikingBatsman);
		
		nonstrike = new JTextField();
		nonstrike.setBounds(71, 238, 275, 27);
		nonstrike.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		nonstrike.setColumns(10);
		contentPane.add(nonstrike);
		
		lblOpeningBowler = new JLabel("Opening Bowler");
		lblOpeningBowler.setBounds(71, 307, 179, 27);
		lblOpeningBowler.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(lblOpeningBowler);
		
		open = new JTextField();
		open.setBounds(71, 344, 275, 27);
		open.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		open.setColumns(10);
		contentPane.add(open);
		
		JButton start = new JButton("Start Match");
		start.setBounds(129, 418, 160, 41);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				getting obj=new getting();
				obj.SqlGet(strike.getText());
				obj.SqlGet(nonstrike.getText());
				obj.SqlGet(open.getText());
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ScoreCard window = new ScoreCard(strike.getText(),nonstrike.getText(),open.getText(),t1,t2);
							window.Frame.setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				temp.setVisible(false);
			}
		});
		start.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(start);
	
	}
}