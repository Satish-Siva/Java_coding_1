package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class PhoneBook {
	
	@Id
	private Long id;
	private String Name;
	private String Email;
	private Integer PhNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getPhNo() {
		return PhNo;
	}
	public void setPhNo(Integer phNo) {
		PhNo = phNo;
	}
	
	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}
	public PhoneBook(Long id, String name, String email, Integer phNo) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		PhNo = phNo;
	}
	@Override
	public String toString() {
		return "PhoneBook [id=" + id + ", Name=" + Name + ", Email=" + Email + ", PhNo=" + PhNo + "]";
	}
	

	
}
