package students.cswithgithub.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;
import students.cswithgithub.DTO.CsDTO;

@RestController
@RequestMapping("/CS")
    public class CsController {

    @PutMapping("/update")
    public Response update(@RequestParam Integer id, @RequestParam Integer useFullLevel) {
        return null;
    }

}
