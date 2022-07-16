package p1;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class pro11_other {
DefaultListModel<String> Model1 = new DefaultListModel<String>();
	public JFrame frame;
	public JLabel section;
	public JLabel faculty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pro11_other window = new pro11_other();
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
	public pro11_other() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 794, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(39, 77, 550, 255);
		frame.getContentPane().add(textPane);
		
		 section = new JLabel("New label");
		section.setBounds(41, 16, 90, 38);
		frame.getContentPane().add(section);
		
		 faculty = new JLabel("New label");
		faculty.setBounds(190, 23, 126, 25);
		frame.getContentPane().add(faculty);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				FileWriter fw = new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\"+section.getText()+"\\"+faculty.getText()+"\\",true);
				fw.append(textPane.getText());
				fw.close();
				frame.dispose();
				}
				catch(Exception ei) {
					JOptionPane.showMessageDialog(btnNewButton, ei.getMessage());
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(190, 342, 153, 32);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
