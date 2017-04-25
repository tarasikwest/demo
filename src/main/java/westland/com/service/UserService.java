package westland.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import westland.com.repository.UserRepository;

/**
 * Created by Max Shtanko on 14March, 2017.
 */
@Service
public class UserService implements UserDetailsService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = (User) userRepository.findUser(username);

        if (user == null) {
            throw new UsernameNotFoundException("could not find the user '" + username + "'");
        }

        return user;
    }
}
