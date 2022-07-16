package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class project11 {
DefaultComboBoxModel<String> Model1=new DefaultComboBoxModel<String>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project11 window = new project11();
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
	public project11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 913, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 443, 899, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DELHI PUBLIC SCHOOL(only 12th)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(252, 31, 333, 73);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "A", "B"}));
		comboBox.setBounds(202, 134, 247, 40);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(Model1);
		comboBox_1.setBounds(202, 229, 247, 34);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Section:-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(27, 132, 108, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Faculty");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(27, 229, 108, 40);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("check Faculty");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0||comboBox.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(btnNewButton, "select section");
				}
				else if(comboBox.getSelectedIndex()==1) {
					Model1.removeAllElements();
					Model1.addElement("");
					Model1.addElement("Neeraja(social)");
					Model1.addElement("Rahul(maths)");
					Model1.addElement("Disha(science)");
				}
				else if(comboBox.getSelectedIndex()==2) {
					Model1.removeAllElements();
					Model1.addElement("");
					Model1.addElement("Meera(social)");
					Model1.addElement("Raj(maths)");
					Model1.addElement("Dashi(science)");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(488, 134, 160, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnWriteFeedback = new JButton("write feedback");
		btnWriteFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0||comboBox.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(btnWriteFeedback,"select section");
				}
				else {
					if(comboBox_1.getSelectedIndex()==0||comboBox_1.getSelectedIndex()==-1) {
						JOptionPane.showMessageDialog(btnWriteFeedback,"select faculty");	
					}
					else {
						pro11_other po = new pro11_other();
						po.section.setText(comboBox.getSelectedItem().toString());
						po.faculty.setText(comboBox_1.getSelectedItem().toString());
						po.frame.setVisible(true);
						
					}
				}
				
			}
		});
		btnWriteFeedback.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnWriteFeedback.setBounds(161, 316, 160, 31);
		frame.getContentPane().add(btnWriteFeedback);
		
		JButton btnReviewFeedbacks = new JButton("review feedbacks");
		btnReviewFeedbacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex()==0||comboBox.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(btnWriteFeedback,"select section");
				}
				else {
					if(comboBox_1.getSelectedIndex()==0||comboBox_1.getSelectedIndex()==-1) {
						JOptionPane.showMessageDialog(btnWriteFeedback,"select faculty");	
					}
					else {
						pro11_other2 po1 = new pro11_other2();
						po1.section.setText(comboBox.getSelectedItem().toString());
						po1.faculty.setText(comboBox_1.getSelectedItem().toString());
						try {
							Scanner sc = new Scanner(new File("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\"+po1.section.getText()+"\\"+po1.faculty.getText()+"\\"));
			                sc.useDelimiter("\n");
			                while(sc.hasNext()) {
			             	po1.feedback.setText(po1.feedback.getText()+"\n"+sc.next());
			                }
			                sc.close();
					    
						}
						catch(FileNotFoundException fn) {
							JOptionPane.showMessageDialog(btnWriteFeedback,"no feedbacks yet");
						}
						catch(Exception ei) {
							JOptionPane.showMessageDialog(btnWriteFeedback,ei.getMessage());
						}
						po1.frame.setVisible(true);
						
					}
				}
				
				
			}
		});
		btnReviewFeedbacks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReviewFeedbacks.setBounds(374, 316, 160, 31);
		frame.getContentPane().add(btnReviewFeedbacks);
	}

}
