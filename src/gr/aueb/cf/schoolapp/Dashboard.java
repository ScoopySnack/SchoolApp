package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel menu = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 800, 61);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(Dashboard.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(10, 0, 178, 61);
		header.add(govImage);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(545, 0, 222, 51);
		header.add(lblNewLabel);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(0, 366, 800, 90);
		contentPane.add(footer);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(new Color(0, 52, 117));
		lblManual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManual.setBackground(new Color(0, 52, 117));
		lblManual.setBounds(34, 43, 115, 37);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(new Color(0, 52, 117));
		lblQuestions.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuestions.setBackground(new Color(0, 52, 117));
		lblQuestions.setBounds(361, 43, 115, 37);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη πολιτών");
		lblSupport.setForeground(new Color(0, 52, 117));
		lblSupport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSupport.setBackground(new Color(0, 52, 117));
		lblSupport.setBounds(660, 43, 115, 37);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 10, 780, 2);
		footer.add(separator);
		menu.setBackground(new Color(0, 52, 117));
		menu.setBounds(0, 61, 203, 307);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Αρχική");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 10, 76, 31);
		menu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Εκπαιδευτές");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 58, 108, 31);
		menu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Προβολή Εκπαιδευτών");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 85, 159, 37);
		menu.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Εισαγωγή Εκπαιδευτών");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(20, 119, 159, 37);
		menu.add(lblNewLabel_3_1);
	}

}
