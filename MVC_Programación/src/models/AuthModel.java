package models;

public class AuthModel {

	public AuthModel() {
		
	}
	public boolean access(String user, String pass) {
		if(user.equals("defaultEmail@email.com")) {
			if(pass.equals("12345")) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
