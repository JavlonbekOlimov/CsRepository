package students.cswithgithub.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import students.cswithgithub.DTO.CsDTO;

@RestController
    @RequestMapping("/Cs")

    public class CsController {

        @PostMapping("/create")
        public Response create(@RequestBody CsDTO dto) {
            return null;
        //aaa
        }
}
