package privit.project.domain.login.contoller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginCotroller {

    @GetMapping(value = "/")
    public String index(HttpServletRequest request, Model model){
        System.out.println("ㅁㅁㅁㅁ");
        model.addAttribute("model","hello");

        return "/index";
    }


}
