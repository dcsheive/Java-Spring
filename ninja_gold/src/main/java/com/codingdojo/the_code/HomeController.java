package com.codingdojo.the_code;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

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
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 50);
			session.setAttribute("actions", new ArrayList<ArrayList<String>>());
		}
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<ArrayList<String>> actions = (ArrayList<ArrayList<String>>) session.getAttribute("actions");
		model.addAttribute("gold", gold);
		model.addAttribute("actions", actions);
		return "index.jsp";
	}
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String code(@RequestParam(value="action") String action, Model model, HttpSession session) {
        Date time = new java.util.Date();
        SimpleDateFormat newformat = new SimpleDateFormat("MMMM d, yyyy h:mm aa");
    	String newdate = newformat.format(time);
    	Random r = new Random();
    	ArrayList<String> aList = new ArrayList<String>();
    	
    	int gold = (int) session.getAttribute("gold");
    	if (action.equals("farm")) {
    		int newGold = r.nextInt(11)+10;
    		gold += newGold;
    		aList.add("Earned "+newGold+" gold from the farm! "+newdate);
    		aList.add("green");
    	}
    	else if (action.equals("cave")) {
    		int newGold = r.nextInt(6)+5;
    		gold += newGold;
    		aList.add("Earned "+newGold+" gold from the cave! "+newdate);
    		aList.add("green");
    	}
    	else if (action.equals("house")) {
    		int newGold = r.nextInt(4)+2;
    		gold += newGold;
    		aList.add("Earned "+newGold+" gold at the house! "+newdate);
    		aList.add("green");
    	}
    	else if (action.equals("casino")) {
    		int chance = r.nextInt(2);
    		if (chance != 1) {
    			int newGold = r.nextInt(51);
    			gold += newGold;
    			aList.add("Won "+newGold+" gold at the casino! "+newdate);
        		aList.add("green");
    		}
    		else {
    			int newGold = r.nextInt(51);
    			gold -= newGold;
    			aList.add("Lost "+newGold+" gold at the casino! "+newdate);
        		aList.add("red");
    		}
    	}
    	else if (action.equals("spa")) {
    		int newGold = r.nextInt(16)+5;
    		gold -= newGold;
    		aList.add("Spent "+newGold+" gold at the spa! "+newdate);
    		aList.add("red");
    	}
    	if (gold < 0) {
            return "redirect:/jail";
    	}
		ArrayList<ArrayList<String>> actions = (ArrayList<ArrayList<String>>) session.getAttribute("actions");
    	actions.add(0, aList);
    	session.setAttribute("actions", actions);
    	session.setAttribute("gold", gold);
        return "redirect:/";
	}
	@RequestMapping("/reset")
	public String clear(HttpSession session) {
		session.setAttribute("gold", null);
		return "redirect:/";
	}
	@RequestMapping("/jail")
	public String prison() {
		return "jail.jsp";
	}
}
