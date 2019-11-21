package pl.adviceservice.srvapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    @ResponseBody
    public String SpringBootHello() {
        return "welcome";                        //zwróci welcome.jsp
    }
}