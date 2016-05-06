package com.springmvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldRestController {

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public Map getMovie() {

		Map m = new HashMap();
		m.put("message", "Hello World");
		return m;
	}


}