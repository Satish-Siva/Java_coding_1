package in.career;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.dao.TeacherDao;
import in.career.entity.Teacher;

@SpringBootTest
class Demo5ApplicationTests {
	
	@Autowired
	private TeacherDao dao;
//	@Test
//	public void saveTeacher() {
//		
//		Teacher t = new Teacher(1L, "SATISH", "s@gmail.com");
//		dao.save(t);
//		System.out.println("Data saved sucessfully");
//	}
//	@Test
//	public void updateTeacher()
//	{
//		Teacher t= new Teacher(2L,"SATISH", "satish@gmail.com");
//		dao.save(t);
//		System.out.println("Data updated sucessfully");
//	}
//    @Test
//	  public void showStudent() {
//		
//  	    Optional<Teacher> Teacher =dao.findById(2L);
//		System.out.println("data founded sucessfully");
//	}
//		@Test
//	    public void showAllStudent() {
//		Iterable<Teacher> allstudents = dao.findAll();
//		System.out.println("Data of all students");
//		
//		
//	}
	@Test
	  public void deletestudent() {
		dao.deleteById(2L);
		System.out.println("data deleted sucessfully");
		
	}
		
		 
}
