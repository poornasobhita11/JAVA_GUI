package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class project20_other {

	public JFrame frame;
	private JTextField name;
	private JTextField email;
	private JTextField totalp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project20_other window = new project20_other();
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
	public project20_other() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 925, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DETAILS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(215, 24, 388, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(38, 101, 170, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(197, 121, 214, 34);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("email");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(38, 191, 170, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(197, 191, 214, 34);
		frame.getContentPane().add(email);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("no. of passenger");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(38, 282, 170, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		totalp = new JTextField();
		totalp.setColumns(10);
		totalp.setBounds(197, 276, 214, 34);
		frame.getContentPane().add(totalp);
		
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				FileWriter fw = new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro20");
				fw.write(name.getText()+","+email.getText()+","+totalp.getText()+"\n");
				fw.flush();
				fw.close();
				frame.dispose();
				}
				catch(Exception ei) {
					JOptionPane.showMessageDialog(submit, ei.getMessage());
				}
				
			}
		});
		submit.setBounds(162, 368, 162, 34);
		frame.getContentPane().add(submit);
	}
}
