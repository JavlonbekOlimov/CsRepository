package students.cswithgithub.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import students.cswithgithub.DAO.CsDAO;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;
import students.cswithgithub.Mapper.CsMapper;
import students.cswithgithub.Repository.CsRepository;
import students.cswithgithub.Services.Interface.CsCrud;

import java.util.List;
import java.util.Optional;

@Service
public class CsService implements CsCrud {

    @Autowired
    private CsRepository repository;

    @Autowired
    private students.cswithgithub.Mapper.CsMapper mapper;

    @Override
    public Response delete(Integer id) {
        if (!repository.existsById(id)) {
            return new Response(1, "Topilmadi", null);
        }
        repository.deleteById(id);
        return new Response(0, "O‘chirildi", null);
    }

    @Override
    public String create(CsDTO csDTO) {
      //  repository.save(mapper.toDao(csDTO));
        return "Ok";
    }

    @Override
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

