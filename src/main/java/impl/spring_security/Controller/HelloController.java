package impl.spring_security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greetMessage(){
        return "Hello from Yashit!!! ";
    }
}
