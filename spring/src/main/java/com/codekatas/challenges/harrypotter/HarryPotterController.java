package com.codekatas.challenges.harrypotter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HarryPotterController {

    @Autowired
    private HarryPotterService harryPotterService;


    @GetMapping(value = "/harry-potter")
    @ResponseBody
    public String getTotalCosts(@RequestParam("books") List<String> bookTitles) {

        // TODO: use harryPotterService
        return "UNKNOWN";
    }
}
