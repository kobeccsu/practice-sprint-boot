package com.leizhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/redirectToLinkedIn")
    public String redirectOut(){
        System.out.println("==> redirect controller");
        return "redirect:http://www.linkedin.com";
    }
}
