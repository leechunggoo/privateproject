package privit.project.domain.main.contoller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainCotroller {

    //로그인 페이지
    @GetMapping(value = "/")
    public String index(Model model){
        System.out.println("111111");
        return "/login/user-login";
    }

    //로그인 submit 받을 url
    @GetMapping(value = "/login/success")
    public String asdaa(Model model){
        System.out.println("헤이");
        //model.addAttribute("model","hello");
        return "/main/home";
    }

    //회원가입 페이지
/*    @PostMapping(value="/login/join")
    public String login_join(){
        System.out.println("회원가입");
        return "/login/join";
    }*/

    

}
