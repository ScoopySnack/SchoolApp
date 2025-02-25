package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UserField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginPage frame = new LoginPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/images/eduv2.png")));
		setTitle("Αυθεντικοποίηση Χρήστη");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConnect = new JLabel("Σύνδεση");
		lblConnect.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConnect.setBounds(214, 10, 81, 60);
		contentPane.add(lblConnect);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 96, 447, 1);
		contentPane.add(separator);
		
		JLabel lblHeading = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblHeading.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeading.setBounds(92, 57, 324, 29);
		contentPane.add(lblHeading);
		
		JLabel lblUser = new JLabel("Χρήστης:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUser.setBounds(153, 107, 81, 29);
		contentPane.add(lblUser);
		
		UserField = new JTextField();
		UserField.setBounds(153, 146, 202, 29);
		contentPane.add(UserField);
		UserField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Κωδικός:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(153, 185, 81, 29);
		contentPane.add(lblPassword);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 52, 117));
		btnConnect.setBounds(181, 283, 146, 36);
		contentPane.add(btnConnect);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 224, 202, 29);
		contentPane.add(passwordField);
	}
}
