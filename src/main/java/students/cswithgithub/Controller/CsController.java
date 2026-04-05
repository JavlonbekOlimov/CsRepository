package students.cswithgithub.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import students.cswithgithub.CsMapper.CsMapper;
import students.cswithgithub.DTO.CsDTO;
import students.cswithgithub.DTO.Response;
import students.cswithgithub.Services.CsService;

@RestController
@RequestMapping("/CS")
    public class CsController {


    @Autowired
    private CsService csService;

    @Autowired
    private CsMapper csMapper;
    @PostMapping("/create")
    public Response create(@RequestBody CsDTO csDTO) {
        String s = csService.create(csDTO);

        if (s.equalsIgnoreCase("OK")) {
            return new Response<>(0, "Ok", "successful");
        }
        return new Response(1,"error",null);
}
}
