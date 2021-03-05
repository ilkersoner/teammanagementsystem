import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class DisplayPlayers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public DisplayPlayers(Team t) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayers.setBounds(5, 5, 426, 23);
		contentPane.add(lblPlayers);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 53, 357, 153);
		contentPane.add(scrollPane);
		
		JList list = new JList(t.team);
		scrollPane.setViewportView(list);
		
		JButton button = new JButton("<--Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagerControl manager=new ManagerControl(t);
				manager.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(10, 230, 85, 21);
		contentPane.add(button);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlayerDetails pd=new PlayerDetails((String) list.getSelectedValue(),t);
				pd.setVisible(true);
				setVisible(false);
			}
		});
		btnDetails.setBounds(341, 230, 85, 21);
		contentPane.add(btnDetails);
	}
}
