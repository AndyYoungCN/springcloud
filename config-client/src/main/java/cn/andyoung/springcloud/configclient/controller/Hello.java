package cn.andyoung.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

  @Value("{test}")
  String test;

  @GetMapping("/test")
  public String test() {
    return this.test;
  }
}
