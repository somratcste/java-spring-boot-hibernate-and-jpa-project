package somrat.info.hibernate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import somrat.info.hibernate.Model.UserContacts;
import somrat.info.hibernate.Model.Users;
import somrat.info.hibernate.Repository.UserContactRepository;

import java.util.List;

@Service
public class UserContactService {

    @Autowired
    private UserContactRepository userContactRepository;


    public List<UserContacts> getUserContactsAll() {
        return userContactRepository.findAll();
    }

    public List<UserContacts> updateUserContacts(UserContacts userContacts, Integer id) {
        Users users = new Users();
        users.setName("Shanto").setSalary(10000).setTeamName("Team");
        userContactRepository.save(userContacts.setUsers(users));
        return userContactRepository.findAll();
    }
}
