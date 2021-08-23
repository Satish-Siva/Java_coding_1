package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Employees {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name ;
	private String department;
	private String designation;
	private String salary ;
	private String city;
	public Employees(String name, String department, String designation, String salary, String city) {
		
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	
	
	

}
