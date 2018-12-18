package somrat.info.hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import somrat.info.hibernate.Model.UserLogs;
import somrat.info.hibernate.Service.UserLogService;

import java.util.List;

@RestController
@RequestMapping("/rest/users/log")
public class UserLogController {

    @Autowired
    private UserLogService userLogService;

    @GetMapping("/all")
    public List<UserLogs> getAll() {
        return userLogService.getAll();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody UserLogs userLogs, @PathVariable Integer id) {
        userLogService.update(userLogs, id);
    }

}
