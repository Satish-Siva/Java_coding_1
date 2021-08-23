package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Data
@ToString
@NoArgsConstructor
public class Users {
	
	@Id
	private Long id;
	@Override
	public String toString() {
		return "Users [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Phno=" + Phno + ", Dob=" + Dob + ", Gender=" + Gender + "]";
	}
	public Users(Long id, String firstName, String lastName, String email, Integer phno, Integer dob, String gender) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phno = phno;
		Dob = dob;
		Gender = gender;
	}

	private String FirstName;
	private String LastName;
	private String Email;
	private Integer Phno;
	private Integer Dob;
	private String Gender;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastNmae() {
		return LastName;
	}
	public void setLastNmae(String lastNmae) {
		LastName = lastNmae;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getPhno() {
		return Phno;
	}
	public void setPhno(Integer phno) {
		Phno = phno;
	}
	public Integer getDob() {
		return Dob;
	}
	public void setDob(Integer dob) {
		Dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

}
