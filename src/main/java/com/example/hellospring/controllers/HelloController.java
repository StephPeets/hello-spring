package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//  Annotation for GET
    @GetMapping("hello") // path/hello
//  Annotation signals plain text response
    @ResponseBody
    public String hello(){
        return "Hello, Spring!";
    }

// Handles requests of the form /hello/LaunchCode
	@GetMapping("hello/{name}")
	@ResponseBody
	public String helloWithPathPathParam(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

	@GetMapping("form")
	public String helloForm(){
		return "form";
	}


}
