package rocks.zipcode.passion.springbootweb.repos;

import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.passion.springbootweb.entities.UserSubmission;

import java.util.List;

public interface UserSubmissionRepository extends CrudRepository<UserSubmission,Integer> {
    List<UserSubmission> findByServiceName(String Servicename);


}
