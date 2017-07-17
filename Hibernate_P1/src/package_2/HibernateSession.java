package package_2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

	public static SessionFactory getSessionFactory() {

		Configuration config = new Configuration();

		config.configure("hibernate.cfg.xml");

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
				.build();

		SessionFactory sessionFactory = config.buildSessionFactory(ssr);

		return sessionFactory;

	}
}
