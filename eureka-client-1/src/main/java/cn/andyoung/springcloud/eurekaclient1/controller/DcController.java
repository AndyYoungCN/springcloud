package cn.andyoung.springcloud.eurekaclient1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

  @RequestMapping("/dc")
  public String dc() {
    String services = "Services:";
    return services;
  }
}
