package fn.main.configuration;

import fn.main.model.Tracker;
import fn.main.service.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class CommonBeanConfig {

    @Bean
    public LoginService buildService() {
        return new LoginService();
    }

    @Bean
    @RequestScope
    public Tracker tracker() {
        return new Tracker();
    }
}
