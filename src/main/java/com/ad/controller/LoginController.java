package com.ad.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ad.beans.Login;
import com.ad.service.UserService;

@Controller
public class LoginController {
	  @Autowired
	  UserService userService;
	  //login route will verify the user
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());

	    return mav;
	  }

	  //Login process will redirect the user as per the result and will show error message if not valid.
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	    @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;

	    Login user = userService.validateUser(login);

	    if (null != user) {
	       mav = new ModelAndView("index");
	       mav.addObject("username", user.getUsername());
	       mav.addObject("userId",user.getUserId());
	    } else {
	       mav = new ModelAndView("login");
	       mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }
}