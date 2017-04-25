package westland.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PingController {

    @RequestMapping("/ping")
    public String hello() {
        return "Application is running.";
    }

}
