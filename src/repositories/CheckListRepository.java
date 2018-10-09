package repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.CheckList;
import model.CheckLists;


@Repository
public interface CheckListRepository extends MongoRepository<CheckList, String>{
}
