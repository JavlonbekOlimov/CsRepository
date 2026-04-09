package students.cswithgithub.Services.Interface;

import students.cswithgithub.DAO.CsDAO;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;

import java.util.List;
import java.util.Optional;

public interface CsCrud {
    String create(CsDTO csDTO);

    Response<List<CsDTO>> getAll();

    Optional<CsDAO> getById(Integer id);
    Response  delete(Integer id);
}
