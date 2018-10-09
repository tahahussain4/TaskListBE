package model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class CheckLists {
	@Id
	String id;
	
	ArrayList<CheckList> checklists;
	
	public void addToCheckList(CheckList checklist) {
		if(checklists == null) {
			checklists = new ArrayList<CheckList>();
		}
		checklists.add(checklist);
	}

	@Override
	public String toString() {
		return "CheckLists [id=" + id + ", checklists=" + checklists + "]";
	}
	
	
}
