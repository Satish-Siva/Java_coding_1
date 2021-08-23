package in.career;

import static org.assertj.core.api.Assertions.as;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.career.entity.Employees;
import in.career.repo.EmployeeRepo;

@SpringBootTest
class PaginationApplicationTests {
	
	
@Autowired
  private EmployeeRepo emprepo;

public void saveEmployee() 

{
 Employee emp1=	
}




@Test
 public void testpagableEmployee() 
 
 {
	 int pageno=1;
	 int pagesize=5;
	 
	 PageRequest pageRequest=PageRequest.of(pageno, pagesize);
	 
     Page<Employees>findAll= emprepo.findAll(pageRequest);
	
		 
 }


}

