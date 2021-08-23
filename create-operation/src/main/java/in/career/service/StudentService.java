package in.career.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.career.entity.Student;
import in.career.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private  StudentRepo sturepo;
	public Student saveStudent(Student stu) 
	{
		Student student =  sturepo.save(stu);
		return student;
	}
	
	public List<Student> getAllStudent()
	{
		List<Student> allStudents = sturepo.findAll();
		return allStudents;
	}
}
