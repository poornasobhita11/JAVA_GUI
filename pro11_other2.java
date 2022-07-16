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
import java.awt.Color;
import javax.swing.SwingConstants;

public class pro11_other2 {
DefaultListModel<String> Model1 = new DefaultListModel<String>();
	public JFrame frame;
	public JLabel section;
	public JLabel faculty;
	public JLabel feedback;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pro11_other2 window = new pro11_other2();
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
	public pro11_other2() {
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
		
		 section = new JLabel("New label");
		section.setBounds(41, 16, 90, 38);
		frame.getContentPane().add(section);
		
		 faculty = new JLabel("New label");
		faculty.setBounds(190, 23, 126, 25);
		frame.getContentPane().add(faculty);
		
		feedback = new JLabel("Feedback:-");
		feedback.setFont(new Font("Tahoma", Font.PLAIN, 12));
		feedback.setVerticalAlignment(SwingConstants.TOP);
		feedback.setHorizontalAlignment(SwingConstants.LEFT);
		feedback.setBackground(Color.WHITE);
		feedback.setForeground(Color.BLACK);
		feedback.setBounds(10, 74, 704, 279);
		frame.getContentPane().add(feedback);
		
		
		
		
	}
}
