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
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class project18_other {

	public JFrame frame;
	private JTextField name;
	private JTextField phoneNo;
	public JLabel movie;
	public JLabel operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project18_other window = new project18_other();
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
	public project18_other() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 607, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 movie = new JLabel("New label");
		movie.setBounds(163, 65, 103, 23);
		frame.getContentPane().add(movie);
		
		 operation = new JLabel("New label");
		operation.setBounds(380, 70, 68, 18);
		frame.getContentPane().add(operation);
		
		JLabel lblNewLabel = new JLabel("Details");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(180, 20, 200, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(36, 98, 142, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(239, 108, 168, 25);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PHONE NO.:-");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(36, 162, 142, 35);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		phoneNo = new JTextField();
		phoneNo.setColumns(10);
		phoneNo.setBounds(239, 162, 168, 25);
		frame.getContentPane().add(phoneNo);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation.getText().equals("book")) {
				try{
					FileWriter fw=new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro18",true);
					if(name.getText().equals("")||phoneNo.getText().equals("")){
			  
						JOptionPane.showMessageDialog(btnNewButton, "enter all details");
					}
					else {
						fw.append(movie.getText()+","+name.getText()+","+phoneNo.getText()+"\n");
						fw.close();
						JOptionPane.showMessageDialog(btnNewButton, "tickets booked:\n"+"movie:"+movie.getText()+"\nname:"+name.getText()+"\nphone No.:"+phoneNo.getText());
						frame.dispose();
					}
				}
				catch(Exception ei) {
					JOptionPane.showMessageDialog(btnNewButton,ei.getMessage());
				}
				
			}
			
				else if(operation.getText().equals("cancel")) {
				try {
					if(name.getText().equals("")||phoneNo.getText().equals("")) {
						JOptionPane.showMessageDialog(btnNewButton,"enter all fields");
					}
					else {
					Scanner sc=new Scanner(new File("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro18"));
					String si="";
					int flag=0;
					sc.useDelimiter("\n");
					while(sc.hasNext()) {
						String[] s=sc.next().split(",");
						if(s[0].equals(movie.getText())) {
							if(s[1].equals(name.getText())) {
								if(s[2].equals(phoneNo.getText())) {
									flag=1;
									continue;
								}
							}
						}
						si=s[0]+","+s[1]+","+s[2]+"\n";
					}
					FileWriter fw=new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro18");
					if(flag==1) {
						JOptionPane.showMessageDialog(btnNewButton, "tickets cancelled:\n"+"movie:"+movie.getText()+"\nname:"+name.getText()+"\nphone No.:"+phoneNo.getText());
					}
					else if(flag==0) {
						JOptionPane.showMessageDialog(btnNewButton, "no prior bookings");
					}
					fw.write(si);
					fw.flush();
					fw.close();
					frame.dispose();
					}}
					catch(Exception ei) {
						JOptionPane.showMessageDialog(btnNewButton,ei.getMessage());
					}
			
				}
			}
		});
		btnNewButton.setBounds(180, 261, 180, 40);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("booking for:-");
		lblNewLabel_2.setBounds(75, 60, 103, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operation:-");
		lblNewLabel_3.setBounds(273, 70, 76, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		
	}
}
