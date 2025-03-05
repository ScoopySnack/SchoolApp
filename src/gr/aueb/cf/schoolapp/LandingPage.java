package gr.aueb.cf.schoolapp;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public LandingPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 658, 61);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(10, 0, 178, 61);
		header.add(govImage);
		
		JLabel lblAuthRequired = new JLabel("Απαιτείται ταυτοποίηση");
		lblAuthRequired.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAuthRequired.setBounds(46, 80, 288, 76);
		contentPane.add(lblAuthRequired);
		
		JLabel lblMustConnect = new JLabel("Για να προχωρήσετε πρέπει να συνδεθείτε");
		lblMustConnect.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMustConnect.setBounds(46, 142, 296, 42);
		contentPane.add(lblMustConnect);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getLoginPage().setVisible(true);
			}
		});
		btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConnect.setEnabled(false);
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setBounds(46, 251, 132, 42);
		contentPane.add(btnConnect);
		
		JCheckBox PrivacyCheckBox = new JCheckBox("Δηλώνω ότι αποδέχομαι την");
		PrivacyCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btnConnect.setEnabled(true);
				} else {
					btnConnect.setEnabled(false);
				}
			}
		});
		PrivacyCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PrivacyCheckBox.setBounds(46, 192, 182, 21);
		contentPane.add(PrivacyCheckBox);
		
		
		
		JLabel lblPrivacy = new JLabel("Δήλωση Ιδιοτηκότητας");
		lblPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrivacy.setForeground(new Color(0, 0, 255));
		lblPrivacy.setBounds(234, 181, 207, 42);
		contentPane.add(lblPrivacy);
		
	
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 332, 643, 90);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(new Color(0, 52, 117));
		lblManual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManual.setBackground(new Color(0, 52, 117));
		lblManual.setBounds(33, 23, 115, 37);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(new Color(0, 52, 117));
		lblQuestions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuestions.setBackground(new Color(0, 52, 117));
		lblQuestions.setBounds(271, 23, 115, 37);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη πολιτών");
		lblSupport.setForeground(new Color(0, 52, 117));
		lblSupport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSupport.setBackground(new Color(0, 52, 117));
		lblSupport.setBounds(493, 23, 115, 37);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 10, 625, 2);
		footer.add(separator);
	}
}
