package app;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import dblayer.CheckListDao;
import dblayer.UserDao;
import model.CheckList;
import model.CheckLists;
import model.Task;
import model.User;
import repositories.CheckListRepository;
import repositories.UserRepository;	


@SpringBootApplication
@ComponentScan("controller")
@ComponentScan("filters")
@ComponentScan("repositories")
@ComponentScan("app")
@EnableMongoRepositories("repositories")
public class Application implements CommandLineRunner{

	@Autowired
	UserDao userDao;
	
	@Autowired
	CheckListDao checklistDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//
	@Override
	public void run(String... args) throws Exception {	
		


	}
}