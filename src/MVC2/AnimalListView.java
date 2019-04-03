package MVC2;

import java.util.List;

public class AnimalListView {
	public AnimalListView() {
		
	}
	
	public void showList(List<Animal> animals) {
	    System.out.flush();  
		System.out.println("\n***** Animal List View *****");
		for(Animal a : animals) {
			System.out.println(a);
		}
		
	}

}
