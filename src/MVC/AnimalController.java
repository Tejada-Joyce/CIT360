package MVC;

import java.util.List;

public class AnimalController {
	
	private static AnimalController single_instance = null;

	public static AnimalController getInstance()
	{
		if(single_instance == null) {
			single_instance = new AnimalController();
		}
		
		return single_instance;
	}
	
	public Animal singleAnimal(int id) {
		return AnimalDAO.getInstance().getAnimal(id);
	}
	
	public List<Animal> allAnimals(){
		return AnimalDAO.getInstance().getAnimals();
	}
}
