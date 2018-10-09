package model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class User {
	
	@Id
	public String id;
	
	public String username;
	public String password;
	
	@DBRef
	private ArrayList<CheckList> checklists;
	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public ArrayList<CheckList> getChecklists() {
		return checklists;
	}

	public void setChecklists(ArrayList<CheckList> checklists) {
		this.checklists = checklists;
	}
	
	public void addCheckList(CheckList checklist) {
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", checklists=" + checklists
				+ "]";
	}


	
	
}
