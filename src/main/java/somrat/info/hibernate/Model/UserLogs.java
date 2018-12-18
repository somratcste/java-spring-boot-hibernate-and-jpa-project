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

    @Column(name = "user_id")
    private Integer userId;

    public UserLogs() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
