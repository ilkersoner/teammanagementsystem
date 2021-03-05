import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddPlayer(Team team) {
		
		setTitle("Add Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("<--Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagerControl manager=new ManagerControl(team);
				manager.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(10, 244, 85, 21);
		contentPane.add(button);
		
		JLabel lblAddANew = new JLabel("Add a new Player");
		lblAddANew.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddANew.setBounds(10, 10, 129, 21);
		contentPane.add(lblAddANew);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(10, 46, 45, 13);
		contentPane.add(lblName);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosition.setBounds(10, 71, 45, 13);
		contentPane.add(lblPosition);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNationality.setBounds(10, 94, 61, 13);
		contentPane.add(lblNationality);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAge.setBounds(10, 116, 45, 13);
		contentPane.add(lblAge);
		
		JLabel lblShirtNumber = new JLabel("Shirt Number");
		lblShirtNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblShirtNumber.setBounds(10, 139, 85, 13);
		contentPane.add(lblShirtNumber);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeight.setBounds(10, 162, 45, 13);
		contentPane.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWeight.setBounds(10, 185, 45, 13);
		contentPane.add(lblWeight);
		
		textField = new JTextField();
		textField.setBounds(117, 44, 116, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(117, 92, 116, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(117, 114, 116, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(117, 137, 116, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(117, 160, 116, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(117, 183, 116, 19);
		contentPane.add(textField_6);
		
		JButton btnAdd = new JButton("Add");
		
		btnAdd.setBounds(233, 244, 85, 21);
		contentPane.add(btnAdd);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Goalkeeper", "Defender", "Forward", "Midfielder"}));
		comboBox.setBounds(117, 68, 116, 21);
		contentPane.add(comboBox);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox.getSelectedItem()=="Goalkeeper") {
					Goalkeeper gk=new Goalkeeper(textField.getText(),(String)comboBox.getSelectedItem(),textField_2.getText(),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),Integer.parseInt(textField_5.getText()),Integer.parseInt(textField_6.getText()));
					JOptionPane.showMessageDialog(contentPane, "new goalkeeper added");
					team.addPlayer(gk);
				}
				else if((String)comboBox.getSelectedItem()=="Defender") {
					Defender defender=new Defender(textField.getText(),(String)comboBox.getSelectedItem(),textField_2.getText(),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),Integer.parseInt(textField_5.getText()),Integer.parseInt(textField_6.getText()));
					JOptionPane.showMessageDialog(contentPane, "new defender added");
					team.addPlayer(defender);
				}
				else if((String)comboBox.getSelectedItem()=="Midfielder") {
					Midfielder mid=new Midfielder(textField.getText(),(String)comboBox.getSelectedItem(),textField_2.getText(),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),Integer.parseInt(textField_5.getText()),Integer.parseInt(textField_6.getText()));
					JOptionPane.showMessageDialog(contentPane, "new midfielder added");
					team.addPlayer(mid);
				}
				else if((String)comboBox.getSelectedItem()=="Defender") {
					Forward forward=new Forward(textField.getText(),(String)comboBox.getSelectedItem(),textField_2.getText(),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),Integer.parseInt(textField_5.getText()),Integer.parseInt(textField_6.getText()));
					JOptionPane.showMessageDialog(contentPane, "new forward added");
					team.addPlayer(forward);
				}
			}
		});
	}
}
