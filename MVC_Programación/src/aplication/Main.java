package aplication;

import controllers.AuthController;
import views.AuthView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AuthController controller = new AuthController();
        controller.login();
	}

}
