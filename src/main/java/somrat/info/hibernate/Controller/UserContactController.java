package somrat.info.hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import somrat.info.hibernate.Model.UserContacts;
import somrat.info.hibernate.Service.UserContactService;

import java.util.List;

@RestController
@RequestMapping("/rest/userscontact")
public class UserContactController {

    @Autowired
    private UserContactService userContactService;

    @GetMapping("/all")
    public List<UserContacts> getUserContactsAll(){
        return userContactService.getUserContactsAll();
    }

    @PutMapping("/update/{id}")
    public void updateUsers(@RequestBody UserContacts userContacts, @PathVariable Integer id) {
        userContactService.updateUserContacts(userContacts, id);
    }
}
