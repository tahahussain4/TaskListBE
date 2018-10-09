package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dblayer.CheckListDao;
import dblayer.UserDao;

@Configuration
public class AppConfig {
    @Bean
    public UserDao userDao() {
        return new UserDao();
    }
    
    @Bean
    public CheckListDao checkListDao() {
        return new CheckListDao();
    }
}