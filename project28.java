package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class project28 {

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
					project28 window = new project28();
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
	public project28() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel quiz = new JLabel("quiz");
		quiz.setFont(new Font("Tahoma", Font.PLAIN, 19));
		quiz.setHorizontalAlignment(SwingConstants.CENTER);
		quiz.setBounds(183, 23, 269, 45);
		frame.getContentPane().add(quiz);
		
		name = new JTextField();
		name.setBounds(260, 100, 212, 36);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(31, 111, 154, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel ll = new JLabel("id");
		ll.setHorizontalAlignment(SwingConstants.CENTER);
		ll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ll.setBounds(31, 175, 154, 25);
		frame.getContentPane().add(ll);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(260, 180, 212, 36);
		frame.getContentPane().add(id);
		
		JButton startquiz = new JButton("START QUIZ");
		startquiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals("")||id.getText().equals("")) {
					JOptionPane.showMessageDialog(startquiz, "enter details");
				}
				else {
					try {
						FileWriter fw=new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro28");
						fw.write(name.getText()+","+id.getText()+",");
						fw.flush();
						fw.close();
						
					}
					catch(Exception ei) {
						JOptionPane.showMessageDialog(startquiz, ei.getMessage());
					}
					project28_other pp=new project28_other();
				    pp.frame.setVisible(true);
				}
			}
		});
		startquiz.setBounds(193, 277, 166, 25);
		frame.getContentPane().add(startquiz);
	}

}
