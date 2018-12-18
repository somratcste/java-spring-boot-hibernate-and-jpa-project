package somrat.info.hibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import somrat.info.hibernate.Model.UserLogs;

public interface UserLogsRepository extends JpaRepository<UserLogs, Integer> {

}
