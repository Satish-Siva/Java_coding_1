package in.career.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.career.entity.Student;
import in.career.service.StudentService;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String loadIndex()
	{
		return "index";
		
	}
	
	@GetMapping("/student")
	public  ModelAndView loadStudentForm() 
	{
		ModelAndView mav = new ModelAndView();
		Student stu = new Student();
		mav.addObject("stu", stu);
		mav.setViewName("studentregistration");
		return mav;
		
	}	
		@GetMapping ("students")
		 public ModelAndView  getAllStudents()
		
		{
			ModelAndView mav = new ModelAndView();
			List<Student> allStudent=stuService.getAllStudent();
			mav.addObject("allStudent", allStudent );
			mav.setViewName("viewStudent");
			return mav;
		}
		
			
	
	@GetMapping("/save")
	
	public String saveStudent(Student stu) {
	stuService.saveStudent(stu);
	return "succes";
	}
	
	@Autowired
	public StudentService stuService;

}
