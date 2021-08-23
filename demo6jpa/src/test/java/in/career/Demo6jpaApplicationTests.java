package in.career;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.dao.EmployeeRepo;
import in.career.entity.Employee;


@SpringBootTest
class Demo6jpaApplicationTests {
	
	@Autowired
	EmployeeRepo emprepo;
	
	@Test
	public void testSave()
	{
		Employee e1=new Employee(1L, "siva", "siva14@gmail.com", "extc", "7385776488", 123456789);
		emprepo.save(e1);
		
	}

}
