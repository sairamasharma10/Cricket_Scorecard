import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class temp {

	public JFrame Frame;
	private JTextField runs;
	private JTextField wickets;
	private JTextField over;
	private JTextField ball;
	private JTextField batsman1;
	private JTextField runs1;
	private JTextField balls1;
	private JTextField four1;
	private JTextField six1;
	private JTextField strikerate1;
	private JTextField batsman2;
	private JTextField runs2;
	private JTextField balls2;
	private JTextField four2;
	private JTextField six2;
	private JTextField strikerate2;
	private JTextField strike;
	private JTextField nonstrike;
	private JTextField b1;
	private JTextField b2;
	private JTextField b3;
	private JTextField b4;
	private JTextField b5;
	private JTextField b6;
	private JTextField b7;
	private JTextField b8;
	private JTextField b9;
	private JTextField b10;
	private JLabel lblNewLabel_1_1_3;
	private JCheckBox wide;
	private JCheckBox noball;
	private JCheckBox byes;
	private JCheckBox legbyes;
	private JCheckBox wicket;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private int ballCount=0;
	private String k1,k2,k3;
	private JTextField bowler;
	private JTextField overs;
	private JTextField maiden;
	private JTextField runsb;
	private JTextField wicketsb;
	private JTextField economy;
	private JLabel lblNewLabel_1_1_5;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp window = new temp(null,null,null);
					window.Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public temp(String k1,String k2,String k3){
		
		this.k1=k1;
		this.k2=k2;
		this.k3=k3;
		initialize();
		
	}

	/**
	 * Initialize the contents of the Frame.
	 */
	private void initialize() {
		Frame = new JFrame();
		Frame.setBounds(100, 100, 613, 549);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setLayout(null);
		
		JLabel match = new JLabel("Match vs Match");
		match.setHorizontalAlignment(SwingConstants.CENTER);
		match.setBounds(36, 10, 519, 38);
		match.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Frame.getContentPane().add(match);
		
		JLabel lblNewLabel_1 = new JLabel("Batsman");
		lblNewLabel_1.setBounds(36, 147, 94, 28);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Runs");
		lblNewLabel_1_1.setBounds(242, 147, 49, 28);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Balls");
		lblNewLabel_1_2.setBounds(301, 147, 49, 28);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4's");
		lblNewLabel_1_3.setBounds(364, 147, 33, 28);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("6's");
		lblNewLabel_1_4.setBounds(407, 147, 33, 28);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("StrikeRate");
		lblNewLabel_1_5.setBounds(461, 147, 94, 28);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1_5);
		
		runs = new JTextField();
		runs.setFont(new Font("Times New Roman", Font.BOLD, 23));
		runs.setEditable(false);
		runs.setHorizontalAlignment(SwingConstants.CENTER);
		runs.setBounds(36, 84, 65, 38);
		Frame.getContentPane().add(runs);
		runs.setColumns(10);
		
		wickets = new JTextField();
		wickets.setFont(new Font("Times New Roman", Font.BOLD, 23));
		wickets.setEditable(false);
		wickets.setHorizontalAlignment(SwingConstants.CENTER);
		wickets.setBounds(135, 84, 65, 38);
		wickets.setColumns(10);
		Frame.getContentPane().add(wickets);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("-");
		lblNewLabel_1_3_1.setBounds(111, 84, 20, 38);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 48));
		Frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Total");
		lblNewLabel_1_1_1.setBounds(36, 46, 65, 28);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		Frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Wickets");
		lblNewLabel_1_1_2.setBounds(135, 46, 70, 28);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		Frame.getContentPane().add(lblNewLabel_1_1_2);
		
		over = new JTextField();
		over.setFont(new Font("Times New Roman", Font.BOLD, 23));
		over.setEditable(false);
		over.setHorizontalAlignment(SwingConstants.CENTER);
		over.setBounds(236, 84, 49, 38);
		over.setColumns(10);
		Frame.getContentPane().add(over);
		
		ball = new JTextField();
		ball.setFont(new Font("Times New Roman", Font.BOLD, 23));
		ball.setEditable(false);
		ball.setHorizontalAlignment(SwingConstants.CENTER);
		ball.setBounds(307, 84, 29, 38);
		ball.setColumns(10);
		Frame.getContentPane().add(ball);
		
		batsman1 = new JTextField();
		batsman1.setHorizontalAlignment(SwingConstants.LEFT);
		batsman1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		batsman1.setBounds(36, 184, 186, 28);
		Frame.getContentPane().add(batsman1);
		batsman1.setColumns(10);
		
		runs1 = new JTextField();
		runs1.setBorder(null);
		runs1.setEditable(false);
		runs1.setText("0");
		runs1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		runs1.setBounds(242, 185, 49, 28);
		runs1.setColumns(10);
		Frame.getContentPane().add(runs1);
		
		balls1 = new JTextField();
		balls1.setBorder(null);
		balls1.setEditable(false);
		balls1.setText("0");
		balls1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		balls1.setBounds(301, 185, 49, 28);
		balls1.setColumns(10);
		Frame.getContentPane().add(balls1);
		
		four1 = new JTextField();
		four1.setBorder(null);
		four1.setEditable(false);
		four1.setText("0");
		four1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		four1.setBounds(364, 184, 29, 28);
		four1.setColumns(10);
		Frame.getContentPane().add(four1);
		
		six1 = new JTextField();
		six1.setBorder(null);
		six1.setEditable(false);
		six1.setText("0");
		six1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		six1.setBounds(407, 184, 33, 28);
		six1.setColumns(10);
		Frame.getContentPane().add(six1);
		
		strikerate1 = new JTextField();
		strikerate1.setBorder(null);
		strikerate1.setEditable(false);
		strikerate1.setText("0");
		strikerate1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		strikerate1.setBounds(461, 185, 70, 28);
		strikerate1.setColumns(10);
		Frame.getContentPane().add(strikerate1);
		
		batsman2 = new JTextField();
		batsman2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		batsman2.setBounds(36, 222, 186, 28);
		batsman2.setColumns(10);
		Frame.getContentPane().add(batsman2);
		
		runs2 = new JTextField();
		runs2.setBorder(null);
		runs2.setEditable(false);
		runs2.setText("0");
		runs2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		runs2.setBounds(242, 223, 49, 28);
		runs2.setColumns(10);
		Frame.getContentPane().add(runs2);
		
		balls2 = new JTextField();
		balls2.setBorder(null);
		balls2.setEditable(false);
		balls2.setText("0");
		balls2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		balls2.setBounds(301, 223, 49, 28);
		balls2.setColumns(10);
		Frame.getContentPane().add(balls2);
		
		four2 = new JTextField();
		four2.setBorder(null);
		four2.setEditable(false);
		four2.setText("0");
		four2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		four2.setBounds(364, 222, 29, 28);
		four2.setColumns(10);
		Frame.getContentPane().add(four2);
		
		six2 = new JTextField();
		six2.setBorder(null);
		six2.setEditable(false);
		six2.setText("0");
		six2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		six2.setBounds(407, 222, 33, 28);
		six2.setColumns(10);
		Frame.getContentPane().add(six2);
		
		strikerate2 = new JTextField();
		strikerate2.setBorder(null);
		strikerate2.setEditable(false);
		strikerate2.setText("0");
		strikerate2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		strikerate2.setBounds(461, 223, 70, 28);
		strikerate2.setColumns(10);
		Frame.getContentPane().add(strikerate2);
		
		strike = new JTextField();
		strike.setHorizontalAlignment(SwingConstants.RIGHT);
		strike.setFont(new Font("Times New Roman", Font.BOLD, 16));
		strike.setBounds(6, 184, 20, 28);
		strike.setColumns(10);
		Frame.getContentPane().add(strike);
		
		nonstrike = new JTextField();
		nonstrike.setHorizontalAlignment(SwingConstants.RIGHT);
		nonstrike.setFont(new Font("Times New Roman", Font.BOLD, 16));
		nonstrike.setBounds(6, 222, 20, 28);
		nonstrike.setColumns(10);
		Frame.getContentPane().add(nonstrike);
		
		b1 = new JTextField();
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b1.setEditable(false);
		b1.setBounds(111, 358, 33, 38);
		b1.setColumns(10);
		Frame.getContentPane().add(b1);
		
		b2 = new JTextField();
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b2.setEditable(false);
		b2.setBounds(154, 358, 33, 38);
		b2.setColumns(10);
		Frame.getContentPane().add(b2);
		
		b3 = new JTextField();
		b3.setHorizontalAlignment(SwingConstants.CENTER);
		b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b3.setEditable(false);
		b3.setBounds(197, 358, 33, 38);
		b3.setColumns(10);
		Frame.getContentPane().add(b3);
		
		b4 = new JTextField();
		b4.setHorizontalAlignment(SwingConstants.CENTER);
		b4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b4.setEditable(false);
		b4.setBounds(242, 358, 33, 38);
		b4.setColumns(10);
		Frame.getContentPane().add(b4);
		
		b5 = new JTextField();
		b5.setHorizontalAlignment(SwingConstants.CENTER);
		b5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b5.setEditable(false);
		b5.setBounds(285, 358, 33, 38);
		b5.setColumns(10);
		Frame.getContentPane().add(b5);
		
		b6 = new JTextField();
		b6.setHorizontalAlignment(SwingConstants.CENTER);
		b6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b6.setEditable(false);
		b6.setBounds(328, 358, 33, 38);
		b6.setColumns(10);
		Frame.getContentPane().add(b6);
		
		b7 = new JTextField();
		b7.setHorizontalAlignment(SwingConstants.CENTER);
		b7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b7.setEditable(false);
		b7.setBounds(371, 358, 33, 38);
		b7.setColumns(10);
		Frame.getContentPane().add(b7);
		
		b8 = new JTextField();
		b8.setHorizontalAlignment(SwingConstants.CENTER);
		b8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b8.setEditable(false);
		b8.setBounds(414, 358, 33, 38);
		b8.setColumns(10);
		Frame.getContentPane().add(b8);
		
		b9 = new JTextField();
		b9.setHorizontalAlignment(SwingConstants.CENTER);
		b9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b9.setEditable(false);
		b9.setBounds(461, 358, 33, 38);
		b9.setColumns(10);
		Frame.getContentPane().add(b9);
		
		b10 = new JTextField();
		b10.setHorizontalAlignment(SwingConstants.CENTER);
		b10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b10.setEditable(false);
		b10.setBounds(504, 358, 33, 38);
		b10.setColumns(10);
		Frame.getContentPane().add(b10);
		
		lblNewLabel_1_1_3 = new JLabel("This Over");
		lblNewLabel_1_1_3.setBounds(36, 358, 65, 38);
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(lblNewLabel_1_1_3);
		
		wide = new JCheckBox("Wide");
		wide.setBounds(36, 406, 65, 21);
		wide.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Frame.getContentPane().add(wide);
		
		noball = new JCheckBox("No-Ball");
		noball.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		noball.setBounds(111, 406, 65, 21);
		Frame.getContentPane().add(noball);
		
		byes = new JCheckBox("Byes");
		byes.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		byes.setBounds(198, 406, 65, 21);
		Frame.getContentPane().add(byes);
		
		legbyes = new JCheckBox("LegByes");
		legbyes.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		legbyes.setBounds(273, 406, 77, 21);
		Frame.getContentPane().add(legbyes);
		
		wicket = new JCheckBox("Wicket");
		wicket.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		wicket.setBounds(375, 405, 65, 25);
		Frame.getContentPane().add(wicket);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				scoreConvert(0,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("0",wide.isSelected(),noball.isSelected());
			}
		});
		zero.setFont(new Font("Times New Roman", Font.BOLD, 28));
		zero.setBounds(36, 433, 65, 66);
		Frame.getContentPane().add(zero);
		
		one = new JButton("1");
		one.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				scoreConvert(1,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("1",wide.isSelected(),noball.isSelected());
			}
		});
		one.setFont(new Font("Times New Roman", Font.BOLD, 28));
		one.setBounds(111, 433, 66, 66);
		Frame.getContentPane().add(one);
		
		two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreConvert(2,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("2",wide.isSelected(),noball.isSelected());
			}
		});
		two.setFont(new Font("Times New Roman", Font.BOLD, 28));
		two.setBounds(187, 433, 65, 66);
		Frame.getContentPane().add(two);
		
		three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreConvert(3,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("3",wide.isSelected(),noball.isSelected());
			}
		});
		three.setFont(new Font("Times New Roman", Font.BOLD, 28));
		three.setBounds(262, 433, 65, 66);
		Frame.getContentPane().add(three);
		
		four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreConvert(4,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("4",wide.isSelected(),noball.isSelected());
			}
		});
		four.setFont(new Font("Times New Roman", Font.BOLD, 28));
		four.setBounds(337, 433, 60, 66);
		Frame.getContentPane().add(four);
		
		five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreConvert(5,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("5",wide.isSelected(),noball.isSelected());
			}
		});
		five.setFont(new Font("Times New Roman", Font.BOLD, 28));
		five.setBounds(407, 433, 59, 66);
		Frame.getContentPane().add(five);
		
		six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreConvert(6,wicket.isSelected(),wide.isSelected(),noball.isSelected());
				SetButton("6",wide.isSelected(),noball.isSelected());
			}
		});
		six.setFont(new Font("Times New Roman", Font.BOLD, 28));
		six.setBounds(482, 433, 60, 66);
		Frame.getContentPane().add(six);
		
		JLabel lblNewLabel_1_6 = new JLabel("Bowler");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_6.setBounds(36, 272, 94, 28);
		Frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Overs");
		lblNewLabel_1_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_1_4.setBounds(242, 272, 49, 28);
		Frame.getContentPane().add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Maidens");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(301, 272, 49, 28);
		Frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Runs");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_3_2.setBounds(364, 272, 33, 28);
		Frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Wickets");
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_4_1.setBounds(417, 272, 49, 28);
		Frame.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Economy");
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_5_1.setBounds(485, 272, 70, 28);
		Frame.getContentPane().add(lblNewLabel_1_5_1);
		
		bowler = new JTextField();
		bowler.setFont(new Font("Times New Roman", Font.BOLD, 16));
		bowler.setColumns(10);
		bowler.setBounds(36, 309, 186, 28);
		Frame.getContentPane().add(bowler);
		
		overs = new JTextField();
		overs.setBorder(null);
		overs.setEditable(false);
		overs.setText("0");
		overs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		overs.setColumns(10);
		overs.setBounds(242, 310, 49, 28);
		Frame.getContentPane().add(overs);
		
		maiden = new JTextField();
		maiden.setBorder(null);
		maiden.setEditable(false);
		maiden.setText("0");
		maiden.setFont(new Font("Times New Roman", Font.BOLD, 15));
		maiden.setColumns(10);
		maiden.setBounds(301, 310, 49, 28);
		Frame.getContentPane().add(maiden);
		
		runsb = new JTextField();
		runsb.setBorder(null);
		runsb.setEditable(false);
		runsb.setText("0");
		runsb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		runsb.setColumns(10);
		runsb.setBounds(364, 309, 40, 28);
		Frame.getContentPane().add(runsb);
		
		wicketsb = new JTextField();
		wicketsb.setBorder(null);
		wicketsb.setEditable(false);
		wicketsb.setText("0");
		wicketsb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		wicketsb.setColumns(10);
		wicketsb.setBounds(417, 309, 49, 28);
		Frame.getContentPane().add(wicketsb);
		
		economy = new JTextField();
		economy.setBorder(null);
		economy.setEditable(false);
		economy.setText("0");
		economy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		economy.setColumns(10);
		economy.setBounds(482, 310, 49, 28);
		Frame.getContentPane().add(economy);
		
		
		batsman1.setText(k1);
		batsman2.setText(k2);
		bowler.setText(k3);
		batsman1.setEditable(false);
		batsman1.setBorder(null);
		batsman2.setEditable(false);
		batsman2.setBorder(null);
		bowler.setEditable(false);
		bowler.setBorder(null);
		runs.setText("0");
		wickets.setText("0");
		over.setText("0");
		ball.setText("0");
		strike.setEditable(false);
		strike.setBorder(null);
		nonstrike.setEditable(false);
		nonstrike.setBorder(null);
		runs.setBorder(null);
		over.setBorder(null);
		ball.setBorder(null);
		
		wickets.setBorder(null);
		lblNewLabel_1_1_5 = new JLabel("Overs");
		lblNewLabel_1_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1_5.setBounds(242, 46, 55, 28);
		Frame.getContentPane().add(lblNewLabel_1_1_5);
		
		textField = new JTextField();
		textField.setText(".");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(282, 83, 20, 38);
		textField.setBorder(null);
		Frame.getContentPane().add(textField);
	}
	public void SetButton(String bno,boolean wide,boolean noball)
	{
		if(ballCount==6)
		{
			
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			b10.setText("");
			ballCount=0;
		}
		if(b1.getText()==null || b1.getText().trim().equals(""))
		{
			b1.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b1.setText("WD");
				else
					b1.setText("NB");
			}
		}
		else if(b2.getText()==null || b2.getText().trim().equals(""))
		{
			b2.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b2.setText("WD");
				else
					b2.setText("NB");
			}
		}
		else if(b3.getText()==null || b3.getText().trim().equals(""))
		{
			b3.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b3.setText("WD");
				else
					b3.setText("NB");
			}
		}
		else if(b4.getText()==null || b4.getText().trim().equals(""))
		{
			b4.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b4.setText("WD");
				else
					b4.setText("NB");
			}
		}
		else if(b5.getText()==null || b5.getText().trim().equals(""))
		{
			b5.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b5.setText("WD");
				else
					b5.setText("NB");
			}
		}
		else if(b6.getText()==null || b6.getText().trim().equals(""))
		{
			b6.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b6.setText("WD");
				else
					b6.setText("NB");
			}
		}
		else if(b7.getText()==null || b7.getText().trim().equals(""))
		{
			b7.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b7.setText("WD");
				else
					b7.setText("NB");
			}
		}
		else if(b8.getText()==null || b8.getText().trim().equals(""))
		{
			b8.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b8.setText("WD");
				else
					b8.setText("NB");
			}
		}
		else if(b9.getText()==null || b9.getText().trim().equals(""))
		{
			b9.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b9.setText("WD");
				else
					b9.setText("NB");
			}
		}
		else if(b10.getText()==null || b10.getText().trim().equals(""))
		{
			b10.setText(bno);
			if(wide==true || noball==true)
			{
				ballCount--;
				if(wide==true)
					b10.setText("WD");
				else
					b10.setText("NB");
			}
		}
		ballCount++;
	}
	public boolean temp=true;
	public void scoreConvert(int i,boolean wt,boolean wi,boolean no)
	{
		if(wt==true)
		{
			int z=Integer.parseInt(wickets.getText());
			z++;
			String s=String.valueOf(z);
			wickets.setText(s);
		}
		pop obj=new pop();
		boolean flag=false;
		if(wi==true || no==true)
			flag=true;
		if(temp==true)
		{
			obj.SqlGet(i,wt,flag,batsman1.getText(),bowler.getText());
		}
		else
		{
			obj.SqlGet(i,wt,flag,batsman2.getText(),bowler.getText());
		}
		if(i%2==0)
			temp=true;
		if(i%2!=0)
			temp=false;
		
		if(temp==true)
		{
			strike.setText("*");
			nonstrike.setText("");
			temp=false;
		}
		else
		{
			nonstrike.setText("*");
			strike.setText("");
			temp=true;
		}
		
		int z=Integer.parseInt(runs.getText());
		int k=z+i;
		if(wi==true || no==true)
			k++;
		String s=String.valueOf(k);
		runs.setText(s);
		if(wi==false || no==false)
		{
			z=Integer.parseInt(ball.getText());
			z++;
			if(z==6)
			{
				z=0;
				int d=Integer.parseInt(over.getText());
				d++;
				String j=String.valueOf(d);
				over.setText(j);
			}
			s=String.valueOf(z);
			ball.setText(s);
		}
		z=Integer.parseInt(runs.getText());
	}
}
