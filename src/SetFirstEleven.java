import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetFirstEleven extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SetFirstEleven(Team t) {
		setTitle("Set First Eleven");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 416, 183);
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
		button.setBounds(20, 230, 85, 21);
		contentPane.add(button);
		
		JButton btnAddToFe = new JButton("Add to FE");
		btnAddToFe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "please select a player for removal");
				}
				else {
					t.addFE(t.findPlayer((String)list.getSelectedValue()));
					JOptionPane.showMessageDialog(contentPane, "player added to first eleven");
				}
			}
		});
		btnAddToFe.setBounds(341, 230, 85, 21);
		contentPane.add(btnAddToFe);
	}
}
