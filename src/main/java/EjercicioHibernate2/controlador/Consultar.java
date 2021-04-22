package EjercicioHibernate2.controlador;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import EjercicioHibernate2.modelo.Departamento;
import EjercicioHibernate2.modelo.Empleado;
import EjercicioHibernate2.principal.Principal;
import EjercicioHibernate2.vista.Menu;

public class Consultar {
	//Logger
	private static Logger logger = LogManager.getLogger(Principal.class);
	private Session session;

	public List<Empleado> listarEmpleadosMenoresDeUnaEdad(int edad) {
		Criteria cr = session.createCriteria(Empleado.class);
		cr.add(Restrictions.lt("fechaNacimiento", edad));
		List<Empleado> results = cr.list();
		logger.info("Listado de empleados menores de "+edad+" listados correctamente");
		return results;
	}

	public List<Empleado> listarEmpleadosPorDepartamento(int codDepartamento) {
		List<Empleado> empleados = null;
		session = Menu.sessionFactory.openSession();
		empleados = session.createQuery("from Empleado where codDepartamento=" + codDepartamento).list();
		logger.info("Empleados del departamento " + codDepartamento + " listados correctamente");
		return empleados;
	}

	public Empleado obtenerEmpleado(int idEmpleado) {
		Empleado empleado = null;
		session = Menu.sessionFactory.openSession();
		empleado = (Empleado) session.get(Empleado.class, idEmpleado);
		logger.info("Empleado obtenido a partir del id: " + idEmpleado);
		return empleado;
	}

	public List<Empleado> listarEmpleados() {
		List<Empleado> empleados = null;
		session = Menu.sessionFactory.openSession();
		empleados = session.createQuery("from Empleado").list();
		logger.info("Empleados listados correctamente");
		return empleados;
	}

	public Departamento obtenerDepartamento(int idDepartamento) {
		Departamento departamento = null;
		session = Menu.sessionFactory.openSession();
		departamento = (Departamento) session.get(Departamento.class, idDepartamento);
		logger.info("Departamento obtenido a partir del id: " + idDepartamento);
		return departamento;
	}

	public List<Departamento> listarDepartamentos() {
		List<Departamento> departamentos = null;
		session = Menu.sessionFactory.openSession();
		departamentos = session.createQuery("from Departamento").list();
		logger.info("Departamentos listados correctamente");
		return departamentos;
	}
}
