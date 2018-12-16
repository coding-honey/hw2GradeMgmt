package kr.ac.hansung.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // @Component("id") + 컨트롤러 역할
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(Locale locale, Model model) {
		
		return "home";
	}
	
}
