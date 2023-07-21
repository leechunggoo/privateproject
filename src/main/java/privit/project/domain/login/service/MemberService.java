package privit.project.domain.login.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import privit.project.domain.login.dao.LoginDao;
import privit.project.domain.login.dto.LoginDto;

import java.util.Optional;

@Component
public class MemberService implements UserDetailsService {
    private final LoginDao logindao;

    public MemberService(LoginDao logindao) {
        this.logindao = logindao;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<LoginDto> userinfo = logindao.requestuser(username);
        LoginDto logindto = userinfo.orElseThrow(()->new UsernameNotFoundException("존재하지않는 회원입니다."));

        return User.builder()
                .username(logindto.getUserid())
                .password(logindto.getPassword())
                .build();

    }


}
