package model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class CheckList {
	
	@Id
	String id;
	
	String name;
	String color;
	ArrayList<Task> tasks ;
	String date;
	
	@DBRef
	User user;
	
	public CheckList(String name,String color,ArrayList<Task> tasks) {
		this.name = name;
		this.color = color;
		if(tasks == null) {
			tasks = new ArrayList<Task>();
		} else {
			this.tasks = tasks;
		}
	}

	@Override
	public String toString() {
		return "CheckList [id=" + id + ", name=" + name + ", color=" + color + ", tasks=" + tasks + ", date=" + date
				+ ", user=" + user + "]";
	}
	
	
}
