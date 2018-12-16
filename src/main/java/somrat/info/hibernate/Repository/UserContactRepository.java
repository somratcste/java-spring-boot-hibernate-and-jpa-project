package somrat.info.hibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import somrat.info.hibernate.Model.UserContacts;

@Repository
public interface UserContactRepository extends JpaRepository<UserContacts, Integer> {

}
