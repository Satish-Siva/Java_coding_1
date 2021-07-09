package in.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic {
	 @GetMapping("/greet")
	public String greet() 
	{
      String msg = "MY NAME IS SATISH-KUMAR"	;
      
      return msg;
      }
	
	
	
	
	

}
