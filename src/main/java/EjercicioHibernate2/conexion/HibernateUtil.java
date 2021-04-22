package EjercicioHibernate2.conexion;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	// La SessionFactory se establece una sola vez por aplicacion!
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		String methodName = HibernateUtil.class.getSimpleName() + ".buildSessionFactory()";
		// configure settings from hibernate.cfg.xml
		final StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();

		try {
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
			return sessionFactory;
		} catch (Exception ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
