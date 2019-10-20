package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

  @GetMapping("/")
  public String index (Model model) {

    model.addAttribute("time", LocalDateTime.now().toString());
    model.addAttribute("version", 
      System.getProperty("java.version")
      + ", "
      + System.getProperty("java.vendor")
      + ", "
      + System.getProperty("java.vm.name")
    );
    return "index";
  }
}