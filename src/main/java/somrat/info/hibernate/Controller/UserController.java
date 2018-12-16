package somrat.info.hibernate.Controller;

import org.springframework.web.bind.annotation.*;
import somrat.info.hibernate.Model.Users;
import somrat.info.hibernate.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

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

    @GetMapping("/{name}")
    public List<Users> getUsers(@PathVariable String name){
       return userService.getUsers(name);
    }

    @PutMapping("/update/{id}")
    public void updateUsers(@RequestBody Users users, @PathVariable Integer id) {
        userService.updateUsers(users, id);
    }
}
