package pe.com.dyd.arquitectura.patrones.proxy.services;

public class SecurityService {
	public boolean authorization(String user, String password) {
		if (user.equals("emarquez") && password.equals("1234")) {
			System.out.println("Usuario: " + user + " autorizado");
			return true;
		} else {
			System.out.println("Usuario: " + user + " NO autorizado");
			return false;
		}
	}
}
