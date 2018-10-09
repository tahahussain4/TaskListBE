package repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	public User findByUsername(String username);
}
