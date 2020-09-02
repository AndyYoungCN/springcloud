package cn.andyoung.springcloud.eurekaconsumerhystrix.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-produce-hello")
public interface Producer {

  @GetMapping("/hello")
  String hello(@RequestParam(value = "name") String name);
}
