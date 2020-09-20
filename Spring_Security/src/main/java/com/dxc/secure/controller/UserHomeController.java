package com.dxc.secure.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {

    @RequestMapping("/home")
    public String homePage() {
	
	return "home.jsp";
    }
    
    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal) {

	return principal;
	
    }
  
}
