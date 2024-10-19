package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HelloController {

//	@GetMapping(value = "/")
//	public String printWelcome(ModelMap model) {
//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm Spring MVC application");
//		messages.add("5.2.0 version by sep'19 ");
//		model.addAttribute("messages", messages);
//		return "index";
//	}
	@GetMapping(value = "/calc")
	public String calculator (@RequestParam(value = "a", required = false) int a,
							  @RequestParam(value = "b", required = false) int b,
							  @RequestParam(value = "action", required = false) String action,
							  ModelMap model) {

		switch (action) {
			case "div":
				model.addAttribute("result", "Division: "+ a + " / " + b + " = " + (a/b));
				break;
			case "sub":
				model.addAttribute("result", "Subtraction: "+ a + " - " + b + " = " + (a-b));
				break;
			case "add":
				model.addAttribute("result", "Addition: "+ a + " + " + b + " = " + (a+b));
				break;
			case "mul":
				model.addAttribute("result", "Multiplication: "+ a + " * " + b + " = " + a*b);
				break;
			default:
				model.addAttribute("result", "Error!");
				break;
		}

		return "first/calc";

	}

	@GetMapping(value = "/hello")
	//public String helloPage(HttpServletRequest request) {
		public String helloPage(@RequestParam(value = "name", required = false) String name,
								@RequestParam(value = "surname", required = false) String surname,
								ModelMap model) {
//		String name = request.getParameter("name");
//		String surname = request.getParameter("surname");

//		System.out.println("Hello, "+ name + " " + surname);

		model.addAttribute("mes", "Hello, "+ name + " " + surname);

		return "first/hello";
	}

	@GetMapping(value = "/goodbye")
	public String goodByePage() {


		return "first/goodbye";
	}

	
}