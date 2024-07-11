package com.basicproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
   @GetMapping("/")
   public String home() {
	   return "index";
   }
   
   @GetMapping("/about")
   public String about() {
	   return "about";
   }
   
   
   @GetMapping("/contact")
   public String contact() {
	   return "contact";
   }
}
