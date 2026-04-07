package students.cswithgithub.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import students.cswithgithub.DTO.Response;
import students.cswithgithub.Repository.CsRepository;

@Service
public class CsService {

    @Autowired
    private CsRepository csRepository;

    public Response delete(Integer id) {
        if (!csRepository.existsById(id)) {
            return new Response(1, "Topilmadi", null);
        }
        csRepository.deleteById(id);
        return new Response(0, "O‘chirildi", null);

    }
}