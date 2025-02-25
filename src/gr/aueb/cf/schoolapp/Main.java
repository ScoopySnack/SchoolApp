package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

public class Main {
	/**
	 * Launch the application.
	 */
	private static final LandingPage LandingPage = new LandingPage();
	private static final LoginPage LoginPage = new LoginPage();
	private static final Dashboard Dashboard = new Dashboard();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage.setVisible(true);
					LandingPage.setLocationRelativeTo(null);
					
					LoginPage.setVisible(false);
					LoginPage.setLocationRelativeTo(null);
					
					Dashboard.setVisible(false);
					Dashboard.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static LandingPage getLandingPage() {
		return LandingPage;
	}

	public static LoginPage getLoginPage() {
		return LoginPage;
	}

	public static Dashboard getDashboard() {
		return Dashboard;
	}
	
	

}
