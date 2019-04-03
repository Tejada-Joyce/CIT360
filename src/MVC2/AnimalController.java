package MVC2;

import java.util.Scanner;

public class AnimalController {
	
	private AnimalFormView form_view;
	private AnimalIndexView index_view;
	private AnimalListView list_view;
	
	public AnimalController() {
		this.form_view = new AnimalFormView();
		this.index_view = new AnimalIndexView();
		this.list_view = new AnimalListView();
	}
	
	public void index(Scanner sc) {
		while(true) {
			int option = this.index_view.showIndexView(sc);
			if(option == 1) {
				Object[] params = this.form_view.showForm(sc);
				Animal a = new Animal((String)params[0], (String)params[1], (String)params[2]);
				AnimalDAO.getInstance().save(a);
			}
			else if(option == 2){
				this.list_view.showList(AnimalDAO.getInstance().getAnimals());				
				continue;
			}else {
				return;
			}
		}
		
	}

}
