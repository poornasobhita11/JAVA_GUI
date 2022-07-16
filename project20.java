package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class project20 {
DefaultComboBoxModel<String> Model1=new DefaultComboBoxModel<String>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project20 window = new project20();
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
	public project20() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 806, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAB BOOKING");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(201, 22, 329, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("time:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(28, 80, 165, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1AM-12PM", "1PM-12PM"}));
		comboBox.setBounds(182, 80, 181, 30);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Available Car:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(28, 148, 165, 32);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox comboBox_1 = new JComboBox(Model1);
		comboBox_1.setBounds(182, 148, 181, 30);
		frame.getContentPane().add(comboBox_1);
		
		JButton book = new JButton("BOOK");
		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0||comboBox.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(book, "select timings");
				}
				else if(comboBox_1.getSelectedIndex()==0||comboBox_1.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(book, "select car");
				}
				else {try {
					FileWriter fw = new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro20");
					fw.write(comboBox.getSelectedItem().toString()+","+comboBox_1.getSelectedItem().toString());
					fw.flush();
					fw.close();
					}
					catch(Exception ei) {
						JOptionPane.showMessageDialog(book, ei.getMessage());
					}
					project20_other pp=new project20_other();
					pp.frame.setVisible(true);
					
				}
			}
		});
		book.setBounds(132, 240, 165, 21);
		frame.getContentPane().add(book);
		
		JButton check = new JButton("check available cars");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0||comboBox.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(check, "select timings");
				}
				else {
					if(comboBox.getSelectedIndex()==1) {
						Model1.removeAllElements();
						Model1.addElement("Prime");
						Model1.addElement("SUV");
						
					}
					if(comboBox.getSelectedIndex()==2) {
						Model1.removeAllElements();
						Model1.addElement("Prime");
						
					}
				}
			}
		});
		check.setBounds(385, 78, 217, 32);
		frame.getContentPane().add(check);
	}
}
