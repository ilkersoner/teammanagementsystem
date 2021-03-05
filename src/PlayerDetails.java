import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayerDetails extends JFrame {

	private JPanel contentPane;

	
	public PlayerDetails(String s,Team t) {
		Player p;
		p=t.findPlayer(s);
		setTitle("Player Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		JList list = new JList(new String[] {"Name: "+p.getName(),"Position: "+p.getPosition(),"Nationality: "+p.getNationality(),"Shirt Number: "+p.getAge(),"Age: "+p.getShirtNumber(),"Height: "+p.getHeight(),"Weight: "+p.getWeight()});
		list.setBounds(54, 30, 332, 168);
		contentPane.add(list);
		
		JButton button = new JButton("<--Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DisplayPlayers dp=new DisplayPlayers(t);
				dp.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(10, 230, 85, 21);
		contentPane.add(button);
	}
}
