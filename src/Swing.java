import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class Swing extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Team team=new Team("Galatasaray");
		team.addPlayer(new Goalkeeper("Muslera","Goalkeeper","Uruguay",1,32,190,84));
		team.addPlayer(new Defender("Martin Linnes","Defender","Norway",14,27,177,72));
		team.addPlayer(new Midfielder("Sophiane Feghouli","Midfielder","Algeria",89,29,177,71));
		team.addPlayer(new Forward("Mbaye Diagne","Forward","Forward",91,27,193,86));
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing frame = new Swing(team);
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
	public Swing(Team t) {
		setForeground(Color.DARK_GRAY);
		setTitle("Football Club Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(117, 54, 191, 19);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogin.setBounds(27, 10, 96, 33);
		contentPane.add(lblLogin);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(117, 83, 191, 19);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setBounds(177, 128, 85, 21);
		contentPane.add(btnLogin);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername.setBounds(38, 54, 69, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(38, 83, 69, 16);
		contentPane.add(lblPassword);
		btnLogin.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (txtId.getText().equals("manager")&&txtPassword.getText().equals("manager")) {
					JOptionPane.showMessageDialog(contentPane, "manager login successful");
					ManagerControl manager=new ManagerControl(t);
					manager.setVisible(true);
					setVisible(false);
					
				}
				else if(txtId.getText().equals("admin")&&txtPassword.getText().equals("admin")){
					JOptionPane.showMessageDialog(contentPane, "admin login successful");
					AnalystControl analyst=new AnalystControl();
					analyst.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(contentPane, "login failed");
			}
		
			
		});
		
	}
}
