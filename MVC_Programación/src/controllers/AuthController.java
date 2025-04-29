package controllers;
import models.AuthModel;
import views.AuthView;

public class AuthController {
	AuthView view;
	private AuthModel model;
	public AuthController() {
		model = new AuthModel();
		view = new AuthView(this,model);
	}
	public void login() {
		view.login();
	}
	public boolean verificarCredenciales(String usuario, String contraseña) {
        return model.access(usuario, contraseña);
    }
	public void register() {
		view.registro();
	}
}
