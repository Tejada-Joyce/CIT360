package MVC;

import javax.persistence.*;

@Entity
@Table(name="animals")

public class AnimalListModel {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="quantity")
    int quantity;

  
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
    public String toString() {
        return "ID" + "\t" + "Name" + "\t" + "Quantity"
        		+ "\n" + id  + "\t" + name + "\t" + quantity ;
    }
        
}
