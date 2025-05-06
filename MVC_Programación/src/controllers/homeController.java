package controllers;

import views.homeView;

public class homeController {

	private homeView home;
	public void home() {
		
		home = new homeView();
		home.setVisible(true);
	}
}
