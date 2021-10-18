package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")


public class HelloController {

	public String greetingsLang(String language) {
		if (language.equalsIgnoreCase("english"))
			return "Hello, ";
		else if (language.equalsIgnoreCase("spanish"))
			return "Hola, ";
		else if (language.equalsIgnoreCase("french"))
			return "Bonjour, ";
		else if (language.equalsIgnoreCase("hindi"))
			return "Namaste, ";
		else if (language.equalsIgnoreCase("danish"))
			return "Hej, ";
		else
			return "Greetings, ";
	}

	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String createMessage(@RequestParam String name, String language) {
		return greetingsLang(language) + name + "!";
	}

	@GetMapping("form")
	public String helloForm() {
		return "<html>" +
			       "<body>" +
			       "<form action='/hello' method='post'>" +
			       "<input type='text' name='name'>" +
			       "<select name='language' id='hello'>" +
			       "<option value='english'>English</option>" +
			       "<option value='spanish'>Spanish</option>" +
			       "<option value='french'>French</option>" +
			       "<option value='hindi'>Hindi</option>" +
			       "<option value='danish'>Danish</option>" +
			       "</select>" +
			       "<input type='Submit' value ='Greet me!'>" +
			       "</form>" +
			       "</body>" +
			       "</html>";
	}


}
