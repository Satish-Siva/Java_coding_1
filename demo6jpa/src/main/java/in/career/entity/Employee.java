package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	private Long id;
	private String name;
	private String email;
	private String department;
	private String mobileno;
	private Integer salary;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Long id, String name, String email, String department, String mobileno, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.mobileno = mobileno;
		this.salary = salary;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	
}
 
