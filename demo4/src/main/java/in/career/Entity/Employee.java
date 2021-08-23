package in.career.Entity;

import java.lang.reflect.Constructor;

import javax.persistence.Entity;
@Entity
public class Employee {
	
	
	@javax.persistence.Id
	private Integer Id;
	private String name;
	private String email;
	private String address;
	
	
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

    public void Employee() {
	// TODO Auto-generated method stub

}
    
}



