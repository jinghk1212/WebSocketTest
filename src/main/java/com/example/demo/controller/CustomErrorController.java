package com.example.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController{
	/*
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException (Exception e) {
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage", e.getMessage());
		return modelAndView;
	}
	*/
	@RequestMapping("/error")
	public String handleError() {
		return "error";
	}
	
	public String getErrorPath() {
		return "/error";
	}
}
