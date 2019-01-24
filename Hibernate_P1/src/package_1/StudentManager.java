package package_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import package_2.HibernateSession;

public class StudentManager {

	public void saveStudent(Student student) {

		SessionFactory sessionFactory = HibernateSession.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(student);

		tx.commit();

		session.close();

	}
	
	public void saveStudentsMarks(StudentsMarks studentmark) {

		SessionFactory sessionFactory = HibernateSession.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(studentmark);

		tx.commit();

		session.close();

	}
}
