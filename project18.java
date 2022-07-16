package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class project18 {

	private JFrame frame;
	private int dorac,junglec,lionc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project18 window = new project18();
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
	public project18() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 969, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
		FileReader f = new FileReader("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro18_init.txt\\");
		BufferedReader bf=new BufferedReader(f);
		String[] sbf=bf.readLine().split(",");
		dorac=Integer.parseInt(sbf[0]);
		junglec=Integer.parseInt(sbf[1]);
		lionc=Integer.parseInt(sbf[2]);
		
		
		}
		catch(Exception ei) {
			JOptionPane.showMessageDialog(frame, ei.getMessage());
		}
		
		JLabel lblNewLabel = new JLabel("MOVIE THEATRE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(240, 25, 363, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DORA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(33, 86, 148, 158);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner dora = new JSpinner();
		dora.setModel(new SpinnerNumberModel(dorac, 0, 10, -1));
		dora.setEnabled(false);
		dora.setBounds(134, 266, 83, 20);
		frame.getContentPane().add(dora);
		
		JLabel lblNewLabel_2 = new JLabel("Available Seats");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(23, 260, 88, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Timings");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(23, 301, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("10:30 AM");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(129, 296, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("JUNGLE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(283, 86, 148, 158);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Available Seats");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(265, 255, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JSpinner jungle = new JSpinner();
		jungle.setModel(new SpinnerNumberModel(junglec, 0, 10, -1));
		jungle.setEnabled(false);
		jungle.setBounds(386, 262, 83, 20);
		frame.getContentPane().add(jungle);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Timings");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_2.setBounds(265, 301, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("10:30 AM");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_1_1.setBounds(374, 296, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("LION KING");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(536, 86, 148, 158);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Available Seats");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1.setBounds(522, 251, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JSpinner lion = new JSpinner();
		lion.setEnabled(false);
		lion.setModel(new SpinnerNumberModel(lionc, 0, 10, -1));
		lion.setBounds(629, 258, 83, 20);
		frame.getContentPane().add(lion);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Timings");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_2_1.setBounds(522, 301, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("10:30 AM");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_1_1_1.setBounds(629, 301, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "DORA", "JUNGLE", "LION"}));
		comboBox.setBounds(297, 372, 183, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("select movie");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(95, 367, 134, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton book = new JButton("BOOK");
		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==-1||comboBox.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(book, "selcect movie");
				}
				else {
					String s="movie";
					int flag=0;
					if(comboBox.getSelectedItem().toString().equals("DORA")) {
						
						if((Integer)dora.getValue()==0) {
							JOptionPane.showMessageDialog(book, "no seats");
							flag=1;
						}
						else {
						dora.setValue(((Integer) dora.getValue())-1);
						s="DORA";
						dorac--;
						}
					}
					if(comboBox.getSelectedItem().toString().equals("JUNGLE")) {
						if((Integer)dora.getValue()==0) {
							JOptionPane.showMessageDialog(book, "no seats");
							flag=1;}
						else {
						jungle.setValue(((Integer) jungle.getValue())-1);
						s="JUNGLE";
						junglec--;
						}
					}
					if(comboBox.getSelectedItem().toString().equals("LION")) {
						if((Integer)dora.getValue()==0) {
							JOptionPane.showMessageDialog(book, "no seats");
							flag=1;}
						else {
						lion.setValue(((Integer) lion.getValue())-1);
						s="LION";
						lionc--;
						}
					}
					if(flag==0) {
						project18_other po=new project18_other();
						po.movie.setText(s);
						po.frame.setVisible(true);
						po.operation.setText("book");
					}
				}
			}
		});
		book.setBounds(236, 416, 148, 35);
		frame.getContentPane().add(book);
		
		JButton cancel = new JButton("CANCEL");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==-1||comboBox.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(cancel, "selcect movie");
				}
				else {
					String s="movie";
					int flag=0;
					if(comboBox.getSelectedItem().toString().equals("DORA")) {
						
						if((Integer)dora.getValue()==10) {
							JOptionPane.showMessageDialog(cancel, "no tickets were booked for this movie toe cancel");
							flag=1;
						}
						else {
						dora.setValue(((Integer) dora.getValue())+1);
						s="DORA";
						dorac++;
						}
					}
					if(comboBox.getSelectedItem().toString().equals("JUNGLE")) {
						if((Integer)dora.getValue()==10) {
							JOptionPane.showMessageDialog(cancel, "no tickets were booked for this movie toe cancel");
							flag=1;}
						else {
						jungle.setValue(((Integer) jungle.getValue())+1);
						s="JUNGLE";
						junglec++;
						}
					}
					if(comboBox.getSelectedItem().toString().equals("LION")) {
						if((Integer)dora.getValue()==0) {
							JOptionPane.showMessageDialog(cancel, "no tickets were booked for this movie toe cancel");
							flag=1;}
						else {
						lion.setValue(((Integer) lion.getValue())+1);
						s="LION";
						lionc++;
						}
					}
					if(flag==0) {
						project18_other po=new project18_other();
						po.movie.setText(s);
						po.operation.setText("cancel");
						po.frame.setVisible(true);
					
					}
				}
				
			}
		});
		cancel.setBounds(479, 416, 148, 35);
		frame.getContentPane().add(cancel);
		
		JButton EXIT = new JButton("EXIT");
		EXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw=new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro18_init.txt\\");
					fw.write(dorac+","+junglec+","+lionc+"\n");
					fw.flush();
					fw.close();
					frame.dispose();
					
				}
				catch(Exception ee) {
					JOptionPane.showMessageDialog(EXIT, ee.getMessage());
				}
			}
		});
		EXIT.setBounds(689, 423, 134, 28);
		frame.getContentPane().add(EXIT);
	}
}
