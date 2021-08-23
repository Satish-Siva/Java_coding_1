package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studentcontroller {
	
	
	@GetMapping("/student")
	public ModelAndView getstudent() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Satish kumar sivaraman");
		mav.addObject("ID", "118A2093");
		mav.addObject("gender", "Male");
		mav.addObject("DOB", "23-09-1999");
		mav.setViewName("student");
	 
		
		return mav;
	}

}
