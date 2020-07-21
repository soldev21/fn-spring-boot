package fn.main.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class User {
    private String username;
    private String password;
}
