package students.cswithgithub.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import students.cswithgithub.Mapper.CsMapper;
import students.cswithgithub.DAO.CsDAO;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;
import students.cswithgithub.Services.CsService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CS")
    public class CsController {


    @Autowired
    private CsService csService;

    @Autowired
    private CsMapper csMapper;

    @DeleteMapping("/delete")
    public Response delete(@RequestParam("id") Integer id) {
        return csService.delete(id);
        }


    @PostMapping("/create")
    public Response create(@RequestBody CsDTO csDTO) {
        String s = csService.create(csDTO);

        if (s.equalsIgnoreCase("OK")) {
            return new Response<>(0, "Ok", "successful");
        }
        return new Response(1,"error",null);
}
    @GetMapping("/getById/{id}")
    public Response getById(@PathVariable Integer id) {
        Optional<CsDAO> dao = csService.getById(id);

        if (dao.isPresent()) {
            return new Response<>(0, "OK", csMapper.toDto(dao.get()));
        }
        return new Response(4, "not found", null);
    } @GetMapping("/getAll")
    public Response<List<CsDTO>> getAllMenu() {
        return csService.getAll();
    }
    }


