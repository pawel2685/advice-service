package pl.adviceservice.srvapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String SpringBootIndex() {
        return "index" ;                        //zwróci index.jsp
    }
}