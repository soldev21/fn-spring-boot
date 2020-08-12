package fn.main;


import fn.main.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Autowired
    LoginService service;


    @Override
    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> responseEntity =
//                restTemplate.exchange("http://localhost:8080/postTest", HttpMethod.POST,null,String.class);
//        System.out.println(responseEntity.getBody());
//        responseEntity =
//                restTemplate.exchange("http://localhost:8080/postTest", HttpMethod.POST,null,String.class);
//        System.out.println(responseEntity.getBody());
    }
}
