package io.getstarted.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "messagingRestClient", path = "/messaging")
public interface MessagingRestClient {

  @GetMapping(params = {"name"})
  Message getMessage(@RequestParam("name") final String name);

  @PostMapping(params = {"name"})
  Message setMessage(@RequestParam("name") final String name, @RequestBody final Message message);
}
