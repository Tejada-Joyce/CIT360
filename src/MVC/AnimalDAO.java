package MVC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.*;

public class AnimalDAO {

	SessionFactory factory = null;
	Session session = null;
	
	private static AnimalDAO single_instance = null;
	
	private AnimalDAO()
	{
		factory = HibernateUtils.getSessionFactory();
	}
	
	public static AnimalDAO getInstance()
	{
		if(single_instance == null) {
			single_instance = new AnimalDAO();
		}
		
		return single_instance;
	}
	
	public List<Animal> getAnimals(){
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from MVC.Animal";
			List<Animal> animals = (List<Animal>)session.createQuery(sql).getResultList();
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
	
	public Animal getAnimal(int id){
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from MVC.Animal where id = " + Integer.toString(id);
			Animal animal = (Animal)session.createQuery(sql).getSingleResult();
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
		List<Animal> an = AnimalDAO.getInstance().getAnimals();
		for (Animal i : an) {
			System.out.println(i);
		}
	}
	
}
