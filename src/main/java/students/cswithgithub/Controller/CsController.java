package students.cswithgithub.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;
import students.cswithgithub.DTO.CsDTO;

@RestController
    @RequestMapping("/Cs")
//tt
    public class CsController {

        @PostMapping("/create")
        public Response create(@RequestBody CsDTO dto) {
            return null;

        }


    @PutMapping("/update")
    public Response updateCs(@RequestParam Integer id) {
        return null;
    }
}
