package com.prueba.controller.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Edinson
 */
  @Controller
public class HomeController {
    @RequestMapping("home.htm")
    
    public ModelAndView home(HttpServletRequest hsr) 
    {
     return new ModelAndView ();
    }
}

  

