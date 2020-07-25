package fn.main.model;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Data
public class Tracker {

    private String id;

    public Tracker() {
        setId(UUID.randomUUID().toString());
    }

    public String format(String msg){
        return id+" "+msg;
    }
}
