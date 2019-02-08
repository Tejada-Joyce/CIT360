package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

public class TestDAO {

	SessionFactory factory = null;
	Session session = null;
	
	private static TestDAO single_instance = null;
	
	private TestDAO()
	{
		factory = HibernateUtils.getSessionFactory();
	}
	
	public static TestDAO getInstance()
	{
		if(single_instance == null) {
			single_instance = new TestDAO();
		}
		
		return single_instance;
	}
	
	public List<Book> getBooks(){
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from Hibernate.Book";
			List<Book> books = (List<Book>)session.createQuery(sql).getResultList();
			session.getTransaction().commit();
			return books;
		} catch (Exception e) {
			e.printStackTrace();
			//Rollback in case of an error occurred.
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
	
	public Book getBook(int id){
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from Hibernate.Book where id = " + Integer.toString(id);
			Book book = (Book)session.createQuery(sql).getSingleResult();
			session.getTransaction().commit();
			return book;
		} catch (Exception e) {
			e.printStackTrace();
			//Rollback in case of an error occurred.
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}


}
