package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class project23 {

	private JFrame frame;
	private JTextField cost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project23 window = new project23();
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
	public project23() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 833, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox premium = new JCheckBox("PREMIUM");
		premium.setBounds(18, 397, 161, 25);
		frame.getContentPane().add(premium);
		
		JButton OneWheeler = new JButton("FOUR WHEELER");
		OneWheeler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float sk=25000;
				if(premium.isSelected())
					sk=sk-(20/sk)*100;
				else
					sk=sk-(10/sk)*100;
				cost.setText(Float.toString(sk));
			}
		});
		OneWheeler.setBounds(288, 89, 138, 65);
		frame.getContentPane().add(OneWheeler);
		
		JButton btnTwoWheeler = new JButton("TWO WHEELER");
		btnTwoWheeler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float sk=15000;
				if(premium.isSelected())
					sk=sk-(20/sk)*100;
				else
					sk=sk-(10/sk)*100;
				cost.setText(Float.toString(sk));
				
				
			}
		});
		btnTwoWheeler.setBounds(84, 89, 138, 65);
		frame.getContentPane().add(btnTwoWheeler);
		
		JButton btnThreeWheeler = new JButton("THREE WHEELER");
		btnThreeWheeler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float sk=17000;
				if(premium.isSelected())
					sk=sk-(20/sk)*100;
				else
					sk=sk-(10/sk)*100;
				cost.setText(Float.toString(sk));
			}
		});
		btnThreeWheeler.setBounds(509, 89, 138, 65);
		frame.getContentPane().add(btnThreeWheeler);
		
		JLabel lblNewLabel = new JLabel("GARAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 30, 365, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COST:-15000");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(96, 177, 126, 58);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("COST:-25000");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(288, 177, 126, 58);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("COST:-17000");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(509, 177, 126, 58);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel cost1 = new JLabel("TOTAL COST");
		cost1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cost1.setBounds(240, 386, 119, 36);
		frame.getContentPane().add(cost1);
		
		cost = new JTextField();
		cost.setEditable(false);
		cost.setBounds(388, 396, 248, 24);
		frame.getContentPane().add(cost);
		cost.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("OVERALL DISCOUNT-10%");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(241, 267, 253, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("(if premium selected then 20% discount)");
		lblNewLabel_3.setBounds(18, 338, 212, 65);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
