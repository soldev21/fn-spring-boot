package fn.main.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fn.main.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class LoginService {

    public LoginService(User body) {
        System.out.println(body);
    }

    public String login(User user) {
        System.out.println(user);
        return "Successful login for ".concat(user.getUsername());
    }
}
