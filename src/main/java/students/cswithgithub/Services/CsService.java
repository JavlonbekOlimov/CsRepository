package students.cswithgithub.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import students.cswithgithub.Mapper.CsMapper;
import students.cswithgithub.DAO.CsDAO;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;
import students.cswithgithub.Repository.CsRepository;
import students.cswithgithub.Services.Interface.CsCrud;

import java.util.List;
import java.util.Optional;

@Service
public class CsService implements CsCrud {

    @Autowired
    private CsRepository repository;

    @Autowired
    private CsMapper mapper;

    @Override
    public String create(CsDTO csDTO) {
        repository.save(mapper.toDao(csDTO));
        return "Ok";
    } @Override
    public Response<List<CsDTO>> getAll() {
        List<CsDAO> daoList = repository.findAll();
        if (!daoList.isEmpty()) {
            List<CsDTO> dtoList = mapper.toDTOList(daoList);
            return new Response<>(0, "Success", dtoList);
        }
        return new Response<>(4, "Error", null);
    }
    @Override
    public Optional<CsDAO> getById(Integer id) {
        Optional<CsDAO> csDAO = repository.findById(id);
        return csDAO;
    }


}