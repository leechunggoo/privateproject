package privit.project.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebMvcInterceptor())
                .excludePathPatterns("/lib/**", "/css/**", "/js/**", "/json/**","resources/**");
    }
}
