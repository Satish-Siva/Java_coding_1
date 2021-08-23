package in.career;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.entity.Employee;
import in.career.repo.EmployeeRepo;

@SpringBootTest
class SoftandHardDeleteApplicationTests {
	
	@Autowired
	private EmployeeRepo emprepo;
	
	@Test
	public void testSaveEmployee()
	{
		Employee e1 = new Employee(2L, "saronlily", "thangaraj", "IT");
		 emprepo.save(e1);
	}

	

}
