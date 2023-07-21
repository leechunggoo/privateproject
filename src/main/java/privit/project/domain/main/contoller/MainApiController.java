package privit.project.domain.main.contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainApiController {
    @PostMapping(value = "/api/userinfo/save")
    public String api_main_request(@RequestParam Map map, Model model){
        System.out.println("map,map");
        System.out.println(map);
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
