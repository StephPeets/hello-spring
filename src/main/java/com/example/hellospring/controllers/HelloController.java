package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")


public class HelloController {

////  Annotation for GET
//    @GetMapping("hello") // path/hello
////  Annotation signals plain text response
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

	// path/hello/goodbye (inherits /hello from annotation class method)
	@GetMapping("goodbye")
	public String goodbye() {
		return "Goodbye, Spring!";
	}

	// Handles request of the form /hello?name=LaunchCode
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String helloWithQueryParam(
		@RequestParam /*@RequestParam as an argument lets the handler method
		know about a given query string based on its own argument*/
			String name, String friend) {

		return "Hello, " + name + " & " + friend + "!";

	}

	// Handles requests of the form /hello/LaunchCode
	@GetMapping("{name}")
	public String helloWithPathPathParam(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

	// /hello/form (inherits /hello from class RequestMapping annotation)
	@GetMapping("form")
	public String helloForm() {
		return "<html>" +
			       "<body>" +
			       "<form action='/hello' method='post'>" + // <- submit a request to /hello
			       "<input type='text' name='name'>" +
			       "<br>" +
			       "<input type='text' name='friend'>" +
			       "<br>" +
			       "<input type='Submit' value ='Greet me!'>" +
			       "</form>" +
			       "</body>" +
			       "</html>";
	}


}
