package in.career.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Employee;

public interface EmployeeRepo extends JpaRepository <Employee, Long>{
	
     List<Employee> findByDeletedFalse();

}
