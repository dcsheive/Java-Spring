package com.codingdojo.hello_world;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
@Controller
//@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("")
    public String index(HttpSession session){
	if(session.getAttribute("times") == null) {
		  session.setAttribute("times", 0);
	}
	int times = (int) session.getAttribute("times");
	times++;
	session.setAttribute("times", times);
      return "index.jsp";
    }
    @RequestMapping("/date")
    public String hello(Model model){
    	Date date = new java.util.Date();
    	
    	SimpleDateFormat newformat = new SimpleDateFormat("MMMM d, yyyy");
    	
    	String newdate = newformat.format(date);    	
    	
        model.addAttribute("date", newdate);
      return "date.jsp";
    }
    @RequestMapping("/hello/")
    public String index2(@RequestParam(value="q") String searchQuery, Model model) {
        model.addAttribute("name", searchQuery);
    	return "hello.jsp";
    }
    @RequestMapping("/time")
    public String world(Model model){
    	Date date = new java.util.Date();
    	
    	SimpleDateFormat newformat = new SimpleDateFormat("h:mm aa");
    	
    	String newdate = newformat.format(date); 
        model.addAttribute("date", newdate);
      return "time.jsp";
    }
    @RequestMapping("/goodbye/{name}")
    public String world2(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
    	return "goodbye.jsp";
    }
    @RequestMapping("/times")
    public String times(HttpSession session, Model model) {
    	model.addAttribute("times", (int) session.getAttribute("times"));
    	return "times.jsp";
    }
}
