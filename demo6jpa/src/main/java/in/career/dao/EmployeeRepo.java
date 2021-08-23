package in.career.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Employee;

public interface EmployeeRepo extends JpaRepository <Employee, Long> {
	
	  Employee findbyEmail (String email);
	  Employee findbymobileno (String mobileno);
	    
	  List<Employee> findbyDepartement (String department);

}
