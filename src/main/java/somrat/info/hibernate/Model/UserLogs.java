package somrat.info.hibernate.Model;

import javax.persistence.*;


@Entity
@Table(name = "user_logs", catalog = "hibernate_app")
public class UserLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer id;

    private String log;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users users;

    public Users getUsers() {
        return users;
    }

    public UserLogs setUsers(Users users) {
        this.users = users;
        return this;
    }

    public UserLogs() {

    }

    public UserLogs(String log) {
        this.log = log;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
