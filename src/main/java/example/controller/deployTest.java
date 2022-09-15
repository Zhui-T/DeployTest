package example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class deployTest {
    @RequestMapping("/test")
    public String test(){
        System.out.println("deploy test. OK.new push.");
        return "deploy test. OK. new push.";
    }
}
