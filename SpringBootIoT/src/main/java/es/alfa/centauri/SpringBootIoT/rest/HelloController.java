package es.alfa.centauri.SpringBootIoT.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Como va eso necio máximo!!!<br><a href='/api/user'>All users</a>";
    }

}
