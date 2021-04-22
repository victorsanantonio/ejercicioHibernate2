package EjercicioHibernate2.controlador;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import EjercicioHibernate2.modelo.Departamento;
import EjercicioHibernate2.modelo.Empleado;
import EjercicioHibernate2.principal.Principal;

public class Modificar {
	private static Logger logger = LogManager.getLogger(Principal.class);
	private Session session;
	private Consultar consultar = new Consultar();

	private void iniciaOperacion(SessionFactory sessionFactory) {
		//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		logger.info("Modificación iniciada");
	}

	private void terminaOperacion() {
		session.getTransaction().commit();
		session.close();
		logger.info("Modificación finalizada");
	}

	public void actualizarEmpleado(int codigoActual, int codigoNuevo, String nombre, String apellido1, String apellido2, String lugarNacimiento, String fechaNacimiento, String direccion, String telefono, String puesto, int codDepartamento, SessionFactory sessionFactory) {
		Empleado empleado = consultar.obtenerEmpleado(codigoActual);
		
		iniciaOperacion(sessionFactory);
		empleado.setCodigo(codigoNuevo);
		empleado.setNombre(nombre);
		empleado.setApellido1(apellido1);
		empleado.setApellido2(apellido2);
		empleado.setLugarNacimiento(lugarNacimiento);
		empleado.setFechaNacimiento(fechaNacimiento);
		empleado.setDireccion(direccion);
		empleado.setTelefono(telefono);
		empleado.setPuesto(puesto);
		empleado.setCodDepartamento(codDepartamento);
		
		session.update(empleado);
		logger.info("Empleado actualizado");
		terminaOperacion();
	}

	public void actualizarDepartamento(int codigoActual, int codigoNuevo, String nombre, int codResponsable, SessionFactory sessionFactory) {
		Departamento departamento = consultar.obtenerDepartamento(codigoActual);
		iniciaOperacion(sessionFactory);
		departamento.setCodigo(codigoNuevo);
		departamento.setNombre(nombre);
		departamento.setCodResponsable(codResponsable);
		session.update(departamento);
		logger.info("Departamento actualizado");
		terminaOperacion();
	}
}
