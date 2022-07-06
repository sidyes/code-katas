package com.codekatas.challenges.greeting;

import com.codekatas.challenges.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = "/greeting")
    @ResponseBody
    public String greet(@RequestParam("name") String name) {

        // TODO: use greetingService
        return "UNKNOWN";
    }
}
