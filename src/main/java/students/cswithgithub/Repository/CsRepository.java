package students.cswithgithub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import students.cswithgithub.DAO.CsDAO;
@Repository
public interface CsRepository extends JpaRepository<CsDAO, Integer> {
}
