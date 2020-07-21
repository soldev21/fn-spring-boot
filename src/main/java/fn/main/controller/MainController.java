package fn.main.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fn.main.model.User;
import fn.main.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    ObjectMapper mapper;

    @Autowired
    LoginService loginService;

    ObjectMapper mapper1 = new ObjectMapper();

    @RequestMapping(value = "/hello/{endpoint}")
    public String test(@PathVariable("endpoint") String endpoint, @RequestBody String body) throws JsonProcessingException {
        switch (endpoint) {
            case "login":
//                System.out.println(body);
                User user = mapper1.readValue(body, User.class);
                System.out.println(user);
                return "You successfully logged in!";
            case "signup":
                return "You signed up";
            case "logout":
                return "You logged out";
            default:
                throw new RuntimeException("There is no such endpoint ".concat(endpoint));
        }
    }

    @RequestMapping(value = "/hello/login")
    public String login(@RequestBody User user) {
        return loginService.login(user);
    }

//    @RequestMapping(value = "/hello/a")
//    public String testa(@RequestBody String a) {
//        return "Hello FN ".concat(a);
//    }
}
