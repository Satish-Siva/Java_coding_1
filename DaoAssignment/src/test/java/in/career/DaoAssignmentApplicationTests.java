package in.career;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.career.dao.UsersDao;
import in.career.entity.Users;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@SpringBootTest
class DaoAssignmentApplicationTests {

	
	@Autowired
	 private UsersDao dao;
	private long id;
	
	
	@Test
	public void testSaveUsers()
	{
	 Users users1 = new Users(6L, "sakshi", "shetty", "sakshi@gmail.com", 1223, 1980, "female");
		dao.save(users1);
}
	@Test
	public void testFindById()
	{
		 id = 1L;
	     java.util.Optional<Users> FindById= dao.findById(id);
		 System.out.println(FindById.get());
		
	}
	
	@Test
	public void testDeleteById()
	{
		id=6L;
		dao.deleteById(id);
		
	}
	@Test
	public void testFindByAll()
	{
		
		Iterable <Users> FindByAll=dao.findAll();
		 System.out.println( FindByAll);
		
	}
}