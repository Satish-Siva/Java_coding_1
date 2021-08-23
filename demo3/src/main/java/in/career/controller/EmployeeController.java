package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.career.bindings.Employee;


@Controller

public class EmployeeController {

	@GetMapping("/")
	 public ModelAndView loadForm() {
	  ModelAndView mav = new ModelAndView();
	  Employee employee =new Employee();  
	  mav.addObject("employee", employee);  
	  mav.setViewName("employee");
	  return mav;
	 }
	
	@PostMapping("save")
	 public ModelAndView saveStudent(EmployeeController employee)
	 {
	  System.out.println(employee);
	  ModelAndView mav=new ModelAndView();
	  mav.addObject("employee", employee);
	  mav.setViewName("sucess");
	  
	  return mav;
		
		
	
	
	

	}

}
