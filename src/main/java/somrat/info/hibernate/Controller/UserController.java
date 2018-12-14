package somrat.info.hibernate.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import somrat.info.hibernate.Model.Users;
import somrat.info.hibernate.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<Users> getAllUsers() {
       return userService.getAllUsers();
    }
}
