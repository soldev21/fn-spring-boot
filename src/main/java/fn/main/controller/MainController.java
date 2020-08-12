package fn.main.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fn.main.model.Tracker;
import fn.main.model.User;
import fn.main.service.LoginService;
import fn.main.util.MyLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    @Autowired
    ObjectMapper mapper;

    @Autowired
    LoginService loginService;

    @Autowired
    Tracker tracker;
    ObjectMapper mapper1 = new ObjectMapper();



    @RequestMapping("/")
    public Object all(){
        return loginService.getAllUsers();
    }

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
//        MyLogger.info2(tracker.format(user.toString()));
        return loginService.login(user);
    }

    static int c;

    @PostMapping("/postTest")
    public String postExample(){
        return "greeting" + ++c;
    }

//    @RequestMapping(value = "/hello/a")
//    public String testa(@RequestBody String a) {
//        return "Hello FN ".concat(a);
//    }
}
