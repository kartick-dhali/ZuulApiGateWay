package com.fresco.apigateway.controller;


import com.fresco.apigateway.service.RegisterService;
import java.security.Principal;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
  @Autowired
  RegisterService service;


  @RequestMapping("/login")
  public String login(HttpServletResponse response, Principal principal) {
    if(principal != null) {
      response.addCookie(new Cookie("user", principal.getName()));
      return "redirect:/ui/";
    }
    else{
      Cookie cookie = new Cookie("user", null);
      cookie.setMaxAge(0);
      response.addCookie(cookie);
      return "login.html";
    }
  }


  @RequestMapping("/")
  public String home(HttpServletResponse response, Principal principal) {
    if(principal != null)
      response.addCookie(new Cookie("user", principal.getName()));
    return "redirect:/ui/";
  }


  @PostMapping("/register")
  public String register(String fullname, String username, String password) {
    service.registerUser(fullname, username, password);
    return "redirect:/login";
  }


  }
