package com.codingdojo.the_code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


//@RestController
@Controller
//@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String trycode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		System.out.println(code);
		if(code.equals("bushido")) {
			return "redirect:/code";
		}
		else {			
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
		
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";		
	}
}
