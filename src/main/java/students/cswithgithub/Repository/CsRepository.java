package students.cswithgithub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import students.cswithgithub.DAO.CsDAO;

public interface CsRepository extends JpaRepository<CsDAO, Integer> {
}
