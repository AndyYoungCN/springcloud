package cn.andyoung.springcloud.eurekaconsumerhystrix.controller;

import cn.andyoung.springcloud.eurekaconsumerhystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

  @Autowired ConsumerService consumerService;

  @RequestMapping("/consumer")
  public String consumer() {
    return consumerService.consumer();
  }
}
