package repositories;

import java.util.ArrayList;

import model.User;


public class DB {
public static User[] users = {new User("user1","password1"),
		new User("user2","password2"),
		};
public static User[] getUsers() {
	return users;
}
}
