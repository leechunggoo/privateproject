package privit.project.domain.main.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainCotroller {

    @GetMapping(value = "/")
    public String asdaa(Model model){
        model.addAttribute("model","hello");
        return "/main/index";
    }


}
