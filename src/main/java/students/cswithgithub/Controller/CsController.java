package students.cswithgithub.Controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import students.cswithgithub.CSDAO.DAO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Cs")

public class CsController {

    @PutMapping("/update")
    public Response update (@RequestBody DAO dao){
        return null;
    }
}
