package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dblayer.UserDao;
import model.User;

@RestController
public class UserController {	
	
	@Autowired
	UserDao userdao;
	
	@RequestMapping("/allUsers")
	public ArrayList<User> getAllUsers(){
		return userdao.getAllUsers();
	}
	
	@RequestMapping("/user/{username}")
	public User getUser(@PathVariable String username){
		return userdao.getUser(username);
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ResponseEntity<User> register(@RequestParam("username") String username,@RequestParam("password") String password) throws Exception{
		User founduser =  userdao.getUser(username);
		System.out.println(founduser);
		if(founduser == null) {
			founduser = userdao.addUser(new User(username,password));
		}  else {
			return new ResponseEntity<User>(HttpStatus.CONFLICT);
		}
		System.out.println(founduser.toString());
		return new ResponseEntity<User>(founduser,HttpStatus.ACCEPTED);
	}
	

}
