package privit.project.domain.main.contoller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainCotroller {

    @GetMapping(value = "/")
    public String main (Model model){
        model.addAttribute("model","hello");
        return "/main/index";
    }


}
