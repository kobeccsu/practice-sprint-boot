package com.leizhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
//        System.out.println("==> session now is " +  session.getAttribute("login"));
        return "login";
    }
}
