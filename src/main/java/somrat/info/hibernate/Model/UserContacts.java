package somrat.info.hibernate.Model;

import javax.persistence.*;

@Entity
@Table(name = "user_contacts", catalog = "hibernate_app")
public class UserContacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "phone_no")
    private Integer phoneNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;

    public UserContacts() {
    }

    public Users getUsers() {
        return users;
    }

    public UserContacts setUsers(Users users) {
        this.users = users;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserContacts setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public UserContacts setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
}
