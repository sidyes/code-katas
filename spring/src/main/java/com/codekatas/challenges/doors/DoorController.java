package com.codekatas.challenges.doors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorController {
  @Autowired
  private DoorService doorService;

  @GetMapping(value = "/doors")
  @ResponseBody
  public String getFinalDoorState() {

    // TODO: use doorService
    return "UNKNOWN";
  }
}
