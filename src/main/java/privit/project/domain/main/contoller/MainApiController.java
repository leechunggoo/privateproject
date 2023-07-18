package privit.project.domain.main.contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainApiController {
    @GetMapping(value = "/Api/main/request")
    public String api_main_request(Model model){
        return "aaaa";
    }

    @PostMapping(value = "/Api/main/insert")
    public String api_main_insert(){
        return "bbbb";
    }
    @GetMapping(value = "/Api/data/request")
    public String api_data_insert(){
        System.out.println("aaaaaaaaaa");
        return "data";
    }


}
