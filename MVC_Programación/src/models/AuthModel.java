package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AuthModel {

	public AuthModel() {
		
	}
	public boolean access(String user, String pass) {
		try {
			BufferedReader lector = new BufferedReader(new FileReader("src/users/usuarios.txt"));
			String usuario;
			
			while((usuario = lector.readLine()) !=null) {
				String [] datos = usuario.split("\\|");
				if(datos.length == 7) {
					String mail = datos[4].trim();
					String contra = datos[5].trim();
					if(user.equals(mail) && pass.equals(contra)) {
						return true;
					}
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Error...");
		}
		return false;
	}
	
	public boolean altaUser(String nombre, String apellidos,String empresa, String ambito , String rol, String usuario, String correo, String contra) {
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter("src/users/usuarios.txt",true));
			String user = nombre+"|"+apellidos+"|"+empresa+"|"+ambito+"|"+rol+"|"+usuario+"|"+correo+"|"+contra;
			
			escritor.newLine();
			escritor.write(user);
			escritor.flush();
			
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error...");
		}
		return false;
	}
}
