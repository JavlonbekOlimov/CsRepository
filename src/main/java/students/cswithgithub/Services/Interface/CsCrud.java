package students.cswithgithub.Services.Interface;

import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;

public interface CsCrud {

    Response<CsDTO> update(Integer id, Integer price);
}