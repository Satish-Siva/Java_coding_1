package in.career;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.career.entity.Student;
import in.career.repo.StudentRepo;

@SpringBootTest
class SoftandHardDelete1ApplicationTests {
 @Autowired
	private StudentRepo repo;
	
	@Test
	public void testSaveStudent() {
		
		Student s1= new Student(1L, "siva", "canaga", "bsc");
		repo.save(s1);
		
	}

}
