package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

public class Main {
	/**
	 * Launch the application.
	 */
	private static final LandingPage LandingPage = new LandingPage();
	private static final LoginPage LoginPage = new LoginPage();
	private static final Dashboard Dashboard = new Dashboard();
	private static final ViewTeachersPage ViewTeachersPage = new ViewTeachersPage();
	private static final TeacherView TeacherView = new TeacherView();
	private static final UpdateTeacherPage UpdateTeacherPage = new UpdateTeacherPage();
	private static final InsertTeacherPage InsertTeacherPage = new InsertTeacherPage();
	
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
					
					ViewTeachersPage.setVisible(false);
					ViewTeachersPage.setLocationRelativeTo(null);
					
					TeacherView.setVisible(false);
					TeacherView.setLocationRelativeTo(null);
					
					UpdateTeacherPage.setVisible(false);
					UpdateTeacherPage.setLocationRelativeTo(null);
					
					InsertTeacherPage.setVisible(false);
					InsertTeacherPage.setLocationRelativeTo(null);
					
					
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
	
	public static ViewTeachersPage getViewTeachersPage() {
		return ViewTeachersPage;
	}
	
	public static TeacherView getTeacherView() {
		return TeacherView;
	}
	
	public static UpdateTeacherPage getUpdateTeacherPage() {
		return UpdateTeacherPage;
	}
	
	public static InsertTeacherPage getInsertTeacherPage() {
		return InsertTeacherPage;
	}

}
