package privit.project.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityfilter(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable()
                .authorizeHttpRequests(request->
                        request.dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                                .requestMatchers("/login/join").permitAll() // security 인증 제외 url등록
                                .requestMatchers("js/**", "css/**", "lib/**", "sso/**").permitAll()
                                .anyRequest().authenticated()
                ).formLogin(
                        login -> login
                                .loginPage("/") //로그인  form이 있는 페이지
                                .loginProcessingUrl("/login/success") //submit 받을 url
                                .usernameParameter("userid")    //submit 할 아이디 login page의 id입력태그 name값
                                .passwordParameter("pass")      //submit 할 pw login page의 password태그 name값
                                .defaultSuccessUrl("/login/success",true) //성공시 login/success 로
                                .permitAll() // 대시보드 이동이 막히면 안되므로 얘는 허용
                ).logout(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new SimplePasswordEncoder();
    }

}

