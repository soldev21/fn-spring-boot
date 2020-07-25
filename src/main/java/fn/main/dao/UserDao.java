package fn.main.dao;

import fn.main.model.Tracker;
import fn.main.util.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class UserDao {

    @Autowired
    Tracker tracker;

    Map<String, String> usersMap;

    public UserDao() {
        usersMap = new HashMap<>();
        usersMap.put("sherif", "123");
        usersMap.put("nazrin", "456");
        usersMap.put("fatma", "789");
    }

    public boolean validateCredentials(String username, String password) {
        MyLogger.info(tracker.format(username+" "+password));
        String s;
        return (Objects.nonNull(s = usersMap.get(username)) && !s.isEmpty()) ? s.equals(password) : false;
    }
}
