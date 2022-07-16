package p1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class project28_other {

	public JFrame frame;
	private JTextField answer;
	int i=0,c=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project28_other window = new project28_other();
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
	public project28_other() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Map<String,String> m=new HashMap<>();
		m.put("national bird of india?","peacock");
		m.put("capital of india?","delhi");
		m.put("national flower of india?", "central");
		m.put("HOW MANY COLOURS ARE THERE IN INDIAN FLAG","three");
		m.put("national animal of india?", "tiger");
		ArrayList<String> list = new ArrayList<String>();
		list.add("national bird of india?");
		list.add("capital of india?");
		list.add("national flower of india?");
		list.add("HOW MANY COLOURS ARE THERE IN INDIAN FLAG?");
		list.add("national animal of india?");
		
		int[] submitted = new int[5];
		
		JLabel question = new JLabel(list.get(i));
		question.setBounds(50, 87, 582, 154);
		frame.getContentPane().add(question);
		
		answer = new JTextField();
		answer.setBounds(46, 277, 290, 29);
		frame.getContentPane().add(answer);
		answer.setColumns(10);
		
		
		
		
		
		JButton next = new JButton("NEXT");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>=4)
					JOptionPane.showMessageDialog(next, "cannot proceed");
				else {
					i++;
				question.setText(list.get(i));
				answer.setText("");
				}
				
			}
		});
		next.setBounds(252, 408, 85, 21);
		frame.getContentPane().add(next);
		
		JButton previous = new JButton("PREVIOUS");
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<=0)
					JOptionPane.showMessageDialog(next, "cannot proceed");
				else {
					i++;
				question.setText(list.get(i));
				answer.setText("");
				}
				
			}
		});
		previous.setBounds(50, 408, 85, 21);
		frame.getContentPane().add(previous);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(m.get(list.get(i)).equals(answer.getText())&&(submitted[i]!=1)){
				 ++c;
				 submitted[i]=1;
			 }
			 
			}
		});
		btnNewButton.setBounds(133, 358, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FINISH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_1, "your total score "+c);
				try {
					FileWriter fw=new FileWriter("D:\\Users\\POORNA\\Documents\\eclipse-workspace\\projects\\src\\p1\\pro28");
					fw.write(c+"\n");
					fw.flush();
					fw.close();
					
				}
				catch(Exception ei) {
					JOptionPane.showMessageDialog(btnNewButton_1, ei.getMessage());
				}
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(145, 459, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
	}

}
