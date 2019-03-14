package MVC;

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
	
	public List<AnimalListModel> getAnimals(){
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from MVC.AnimalListModel";
			List<AnimalListModel> animals = (List<AnimalListModel>)session.createQuery(sql).getResultList();
			session.getTransaction().commit();
			return animals;
		} catch (Exception e) {
			e.printStackTrace();
			//Rollback in case of an error occurred.
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
	
	public AnimalListModel getAnimal(int id){
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from MVC.AnimalListModel where id = " + Integer.toString(id);
			AnimalListModel animal = (AnimalListModel)session.createQuery(sql).getSingleResult();
			session.getTransaction().commit();
			return animal;
		} catch (Exception e) {
			e.printStackTrace();
			//Rollback in case of an error occurred.
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
	
	public void printAnimals(){
		List<AnimalListModel> an = TestDAO.getInstance().getAnimals();
		for (AnimalListModel i : an) {
			System.out.println(i);
		}
	}
	
}
