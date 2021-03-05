import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ManagerControl extends JFrame {

	private JPanel contentPane;

	public ManagerControl(Team t) {
		setTitle("Manager Control");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddNewPlayer = new JButton("Add New Player");
		btnAddNewPlayer.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddNewPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddPlayer add=new AddPlayer(t);
				add.setVisible(true);
				setVisible(false);
			}
		});
		btnAddNewPlayer.setBounds(10, 44, 416, 27);
		contentPane.add(btnAddNewPlayer);
		
		JButton btnNewButton = new JButton("Remove Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RemovePlayer remove=new RemovePlayer(t);
				remove.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 79, 416, 27);
		contentPane.add(btnNewButton);
		
		JButton btnSetFirstEleven = new JButton("Set First Eleven");
		btnSetFirstEleven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetFirstEleven sfe=new SetFirstEleven(t);
				sfe.setVisible(true);
				setVisible(false);
				
			}
		});
		btnSetFirstEleven.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSetFirstEleven.setBounds(10, 116, 416, 27);
		contentPane.add(btnSetFirstEleven);
		
		JButton btnDisplayPlayerStatistics = new JButton("Display Player Attributes");
		btnDisplayPlayerStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplayPlayers display=new DisplayPlayers(t);
				display.setVisible(true);
				setVisible(false);
			}
		});
		btnDisplayPlayerStatistics.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDisplayPlayerStatistics.setBounds(10, 155, 416, 27);
		contentPane.add(btnDisplayPlayerStatistics);
		
		JButton btnDisplayFirstEleven = new JButton("Display First Eleven");
		btnDisplayFirstEleven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplayFirstEleven dfe=new DisplayFirstEleven(t);
				dfe.setVisible(true);
				setVisible(false);
			}
		});
		btnDisplayFirstEleven.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDisplayFirstEleven.setBounds(10, 192, 416, 27);
		contentPane.add(btnDisplayFirstEleven);
		
	}
}
