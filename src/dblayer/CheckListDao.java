package dblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.CheckList;
import repositories.CheckListRepository;

@Component
public class CheckListDao {
	
	@Autowired
	CheckListRepository checklistRepository;
	
	public boolean add(CheckList list) {
		checklistRepository.save(list);
		return true;
	}
	
	public boolean update(CheckList list) {
		checklistRepository.save(list);
		return true;
	}
	
	public boolean delete(CheckList list) {
		checklistRepository.delete(list);
		return true;
	}
	
	public boolean deleteAll() {
		checklistRepository.deleteAll();
		return true;
	}
	

}
