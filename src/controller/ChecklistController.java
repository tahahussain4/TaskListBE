package controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.CheckList;
import model.Task;

@RestController
public class ChecklistController {
	
	@RequestMapping("/checklists/{user}")
	public CheckList getCheckLists(){
		ArrayList<Task> tasks = new ArrayList<Task>();
		return new CheckList("newChecklist", "blue", tasks);
	}
}
