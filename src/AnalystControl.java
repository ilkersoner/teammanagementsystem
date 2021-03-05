import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class AnalystControl extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalystControl frame = new AnalystControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AnalystControl() {
		setTitle("Analyst Control");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 426, 251);
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(panel);
		
		JButton button = new JButton("Add New Player");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(40, 42, 153, 27);
		panel.add(button);
		
		JButton button_1 = new JButton("Remove Player");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(40, 79, 153, 27);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Set First Eleven");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(40, 116, 153, 27);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Display Player Statistics");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(40, 155, 227, 27);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Display Team Statistics");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(40, 192, 227, 27);
		panel.add(button_4);
	}

}
