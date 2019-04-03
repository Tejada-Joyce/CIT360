package MVC2;

import javax.persistence.*;

@Entity
@Table(name="animals")

public class Animal {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="breed")
    private String breed;
	
	@Column(name="status")
    private String status;
	
	public Animal () {} 
	
    public Animal(String name, String breed, String status) {
		super();
		this.name = name;
		this.breed = breed;
		this.status = status;
	}


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

	public String getBreed() {
		return breed;
	}


	public void setBreed(String description) {
		this.breed = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
    public String toString() {
        return ""+id+"\t"+name+"\t"+breed+"\t"+status;
    }
        
}
