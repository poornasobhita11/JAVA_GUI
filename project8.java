package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class project8 {

	private JFrame frame;
	private JTextField name;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project8 window = new project8();
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
	public project8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 904, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPORT'S  PARTICIPATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(150, 32, 525, 47);
		frame.getContentPane().add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(369, 117, 207, 31);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:-");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(183, 102, 176, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:-");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(183, 178, 176, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(369, 178, 207, 31);
		frame.getContentPane().add(id);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Baksetball", "Volleyball", "Badminton", "Tennis", "Table tennis"}));
		comboBox.setBounds(369, 242, 202, 41);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Select Sport:-");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(183, 242, 176, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JRadioButton single = new JRadioButton("Single");
		single.setFont(new Font("Tahoma", Font.PLAIN, 14));
		single.setBounds(369, 316, 103, 41);
		frame.getContentPane().add(single);
		
		JRadioButton doubles = new JRadioButton("double");
		doubles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		doubles.setBounds(369, 364, 118, 48);
		frame.getContentPane().add(doubles);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("select single/\r\ndouble participation:-");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(68, 281, 291, 131);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		ButtonGroup bg= new ButtonGroup();
		bg.add(single);
		bg.add(doubles);
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s="single";
				int flag=0;
				if((name.getText().equals(""))||(id.getText().equals(""))||(comboBox.getSelectedIndex()==0||comboBox.getSelectedIndex()==-1)||(bg.getSelection()==null)) {
					flag=1;
					JOptionPane.showMessageDialog(btnNewButton, "enter all fields");
				}
				else {
					if(single.isSelected()) {
						s="single";
					}
					else if(doubles.isSelected()) {
						s="doubles";
					}
				}
				if(flag==0) {
					try {
						FileWriter fw = new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro8\\",true);
						String p= "\nName:-"+name.getText()+"\nid:-"+id.getText()+"\nsport:-"+comboBox.getSelectedItem().toString()+"\nteam:-"+s+"\n******";
						fw.append(p);
						//fw.flush();
						fw.close();
					}
					catch(Exception ei) {
						JOptionPane.showMessageDialog(btnNewButton, ei.getMessage());
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(617, 364, 139, 37);
		frame.getContentPane().add(btnNewButton);
	}
}
