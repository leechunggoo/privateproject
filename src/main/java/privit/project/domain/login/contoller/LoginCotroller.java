package privit.project.domain.login.contoller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginCotroller {

    @PostMapping(value = "/spring/login")
    public String login(Model model){
        System.out.println("여긴왔으");
        model.addAttribute("model","hello");
        return "/main/index";
    }


}
