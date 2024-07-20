package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homePage() {
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/menu")
	public String menuPage() {
		return "menu";
	}
}
