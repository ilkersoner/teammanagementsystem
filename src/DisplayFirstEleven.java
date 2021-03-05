import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayFirstEleven extends JFrame {

	private JPanel contentPane;

	
	public DisplayFirstEleven(Team t) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 416, 180);
		contentPane.add(scrollPane);
		
		JList list = new JList(t.displayFE());
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
	}

}
