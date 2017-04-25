package westland.com.repository;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

/**
 * Created by Max Shtanko on 14March, 2017.
 */
@Repository
public class UserRepository {

    public UserDetails findUser(String userLogin) {
        return new User(userLogin, "123", true, true, true, true,
                AuthorityUtils.createAuthorityList("USER"));
    }
    }
