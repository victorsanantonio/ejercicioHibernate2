package EjercicioHibernate2.principal;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import EjercicioHibernate2.controlador.Consultar;
import EjercicioHibernate2.vista.Menu;


public class Principal {
	private static Logger logger = LogManager.getLogger(Principal.class);
	
	public static void main(String[] args) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String url = "C:\\Users\\Formacion\\Desktop\\HibernateEjercicio1\\EjercicioHibernate1\\src\\main\\java\\log4j.properties";
		PropertyConfigurator.configure(url);
		
		Menu menu = new Menu();
		menu.controlMenu();
	}
}
