package dblayer;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import model.User;
import repositories.UserRepository;

public class UserDao {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired 
	CheckListDao checklistDao;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
	
	public void deleteAll() {
		userRepository.deleteAll();
	}
	
	public ArrayList<User> getAllUsers(){
		return (ArrayList<User>) userRepository.findAll();
	}
	
	public User getUser(String username){
		return userRepository.findByUsername(username);
	}
}
