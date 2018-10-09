package controller;


import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public User home(){
		System.out.println("reached home");
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		ObjectMapper mapper = new ObjectMapper();
		User user = new User("tahahussain4","password");
		String returnJSON = null;
		try {
			returnJSON=mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(returnJSON);
		return user;
	}
	
	@RequestMapping("/posting")
	public String post(){
		System.out.println("reached home");
		return "<p>home</p>";
	}
}
