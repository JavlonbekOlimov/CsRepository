package students.cswithgithub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;
import students.cswithgithub.Services.CsService;

@RestController
@RequestMapping("/CS")
    public class CsController {

    @Autowired
    private CsService csService;

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Integer id) {
        return new Response<>(0,"Topilmadi",null);
    }
}
