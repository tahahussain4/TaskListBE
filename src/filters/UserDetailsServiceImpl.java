package filters;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    public UserDetailsServiceImpl() {

    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Test
    		System.out.println("USERNAME DETAILS SERVICEßs");
        return new User("taha", "{noop}hussain", emptyList());
    }
}