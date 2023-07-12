package privit.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        /*http
                .csrf()
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and() //token name = XSRF-TOKEN 값생성
                .headers(headers ->headers.contentSecurityPolicy(policy -> policy.policyDirectives(""
                    +"script-src 'self' *.datatable.net *.highcharts.com; "
                    +"object-src none;"
                    +"base-uri 'none';")))
                .build();
        return http.csrf().disable().
                headers(headers->headers.contentSecurityPolicy(policy -> policy.policyDirectives(""
//                +"script-src 'self' *.datatable.net*.highcharts.com*; "
                +"object-src none;"
                +"base-uri 'none';"))).build();
            */
        return http.csrf().
                csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .headers(headers->headers.contentSecurityPolicy(policy -> policy.policyDirectives(""
                +"script-src 'self' *.datatable.net , *.highcharts.com;"
                +"object-src none;"
                +"base-uri 'none';"))).build();
    }


}
