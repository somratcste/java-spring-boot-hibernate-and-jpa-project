package somrat.info.hibernate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import somrat.info.hibernate.Model.UserLogs;
import somrat.info.hibernate.Model.Users;
import somrat.info.hibernate.Repository.UserLogsRepository;

import java.util.List;

@Service
public class UserLogService {

    @Autowired
    private UserLogsRepository userLogsRepository;

    public List<UserLogs> getAll() {
        return userLogsRepository.findAll();
    }

    public List<UserLogs> update(UserLogs userLogs, Integer id) {
        Users users = new Users();
        users.setName("Salma").setSalary(20000).setTeamName("Operation");

        UserLogs userLogs1 = new UserLogs();
        userLogs1.setUsers(users).setLog("Hi Youtube");

        UserLogs userLogs2 = new UserLogs();
        userLogs2.setUsers(users).setLog("Hi Viewers");

        userLogsRepository.save(userLogs1);
        userLogsRepository.save(userLogs2);

        return userLogsRepository.findAll();
    }
}
