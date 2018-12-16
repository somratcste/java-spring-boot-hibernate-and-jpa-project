package somrat.info.hibernate.Service;

import somrat.info.hibernate.Model.Users;
import somrat.info.hibernate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Users> getUsers(String name) {
        return userRepository.findByName(name);
    }

    public void updateUsers(Users users, Integer id) {
        users.setId(id);
        userRepository.save(users);
    }
}
