package fn.main.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@ToString
public class UserEntity {
    @Id
    Integer id;
    String username;
    String password;
    String name;
    String surname;
    String father;
}
