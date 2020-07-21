package fn.main.configuration;

import fn.main.service.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonBeanConfig {

//    @Bean
    public LoginService buildService(){
        return new LoginService(15);
    }
}
