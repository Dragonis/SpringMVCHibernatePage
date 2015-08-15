package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hi";
	}

	@RequestMapping("/news")
	public ModelAndView without_news(HttpServletRequest request,
								 HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("news");
		mav.addObject("message", "");
		return mav;
	}

	@RequestMapping("/news/{message}")
	public ModelAndView with_news(@PathVariable("message") String message,
								 HttpServletRequest request,
							   HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("news");
		mav.addObject("message",message);
		return mav;

	}
}