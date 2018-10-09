package model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Task {
	@Id
	String id;
	
	LocalDate timeCreated;
	boolean completed;
	String data;
	
}
