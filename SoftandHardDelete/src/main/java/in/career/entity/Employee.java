package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Employee {
	
	@Id
	private Long id ;
	private String firstname;
	private String lastname;
	private String group;
	
	private boolean deleted=false;
	
		
		
	public Employee(Long id, String firstname, String lastname, String group) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.group = group;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
		
public Employee() {
		// TODO Auto-generated constructor stub
	}

}
