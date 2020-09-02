package cn.andyoung.springcloud.eurekaconsumerhystrix.controller;

import cn.andyoung.springcloud.eurekaconsumerhystrix.api.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

  @Autowired Producer producer;

  @RequestMapping("/dc")
  public String dc() {
    return producer.hello("feign");
  }
}
