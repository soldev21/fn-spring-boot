package fn.main.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fn.main.dao.UserDao;
import fn.main.model.Tracker;
import fn.main.model.User;
import fn.main.util.MyLogger;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//@Service
@Data
public class LoginService {

    @Autowired
    UserDao userDao;

    @Autowired
    Tracker tracker;

    public String login(User user) {
        MyLogger.info(tracker.format(user.toString()));
        return userDao.validateCredentials(user.getUsername(),user.getPassword()) ? "Success" : "Fail";
    }
}
