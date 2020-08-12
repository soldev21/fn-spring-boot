package fn.main.dao;

import fn.main.entity.UserEntity;
import fn.main.model.Tracker;
import fn.main.repository.UserRepository;
import fn.main.util.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@Service
public class UserDao {

    @Autowired
    Tracker tracker;

    @Autowired
    UserRepository userRepository;

    public boolean validateCredentials(String username, String password) {
//        MyLogger.info(tracker.format(username+" "+password));
        UserEntity userEntity = userRepository.getByUserNameAnAndPassword(username,password);
        MyLogger.info(userEntity== null ? null : userEntity.toString());
        return Objects.isNull(userEntity) ? false : true;
    }

    public Iterable<UserEntity> findAll(){
        return userRepository.findAll();
    }
}
