import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemovePlayer extends JFrame {

	private JPanel contentPane;

	
	public RemovePlayer(Team t) {
		setTitle("Remove Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList(t.team);
		
		  
		list.setBounds(23, 39, 403, 135);
		contentPane.add(list);
		
		JButton button = new JButton("<-- Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagerControl manager=new ManagerControl(t);
				manager.setVisible(true);
			}
		});
		button.setBounds(10, 230, 85, 21);
		contentPane.add(button);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "please select a player for removal");
				}
				else {
					t.removePlayer((String)list.getSelectedValue());
					setVisible(false);
					setVisible(true);
				}
			}
		});
		btnDelete.setBounds(341, 230, 85, 21);
		contentPane.add(btnDelete);
		
	}
}
