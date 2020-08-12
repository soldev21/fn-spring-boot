package fn.main.repository;

import fn.main.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer> {

    @Query(nativeQuery = true,value= "select * from users u where u.username=:username and u.password=md5(:password)")
    UserEntity getByUserNameAnAndPassword(@Param("username") String username,@Param("password") String password);
}
