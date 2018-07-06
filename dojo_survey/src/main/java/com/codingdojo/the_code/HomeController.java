package com.codingdojo.the_code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//@RestController
@Controller
//@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String code(@RequestParam(value="name") String name,@RequestParam(value="sel2") String sel2,@RequestParam(value="sel1") String sel1,@RequestParam(value="comment") String com, Model model) {
        if( sel2.equals("Java")) {
        	model.addAttribute("name", name);
        	model.addAttribute("location", sel1);
        	model.addAttribute("comment", com);
        	return "Java.jsp";	
        }
        else {
        	
        	model.addAttribute("name", name);
        	model.addAttribute("location", sel1);
        	model.addAttribute("language", sel2);
        	model.addAttribute("comment", com);
        	return "code.jsp";		
        }
	}
}
