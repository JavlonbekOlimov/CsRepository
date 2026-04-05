package students.cswithgithub.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
import students.cswithgithub.CsMapper.CsMapper;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.Repository.CsRepository;
import students.cswithgithub.Services.Interface.CsCrud;

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
    }


}