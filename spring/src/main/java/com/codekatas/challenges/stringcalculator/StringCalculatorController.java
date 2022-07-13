package com.codekatas.challenges.stringcalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringCalculatorController {

  @Autowired
  private StringCalculatorService stringCalculatorService;

  @GetMapping(value = "/string-calculator")
  @ResponseBody
  public String getCalculatedString(@RequestParam("input") String input) {

    // TODO: use stringCalculatorService
    return "UNKNOWN";
  }
}
