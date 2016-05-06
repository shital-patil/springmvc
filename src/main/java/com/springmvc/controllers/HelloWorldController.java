package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.service.impl.CalculatorImpl;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String hello(ModelMap model) {
			model.addAttribute("msg", "Hello World!");
			return "helloWorld";
		}

		@RequestMapping(value = "/add", method = RequestMethod.POST)
		public String add(@RequestParam("a") double a, @RequestParam("b") double b, ModelMap model) {
			
			CalculatorImpl cal = new CalculatorImpl();
			
			double result = cal.add(a, b);
			
			model.addAttribute("result", result);
			return "calcResult";
		}
		
		@RequestMapping(value = "/substract", method = RequestMethod.POST)
		public String substract(@RequestParam("a") double a, @RequestParam("b") double b, ModelMap model) {
			
			CalculatorImpl cal = new CalculatorImpl();
			
			double result = cal.substract(a, b);
			
			model.addAttribute("result", result);
			return "calcResult";
		}
		
		@RequestMapping(value = "/multiply", method = RequestMethod.POST)
		public String multiply(@RequestParam("a") double a, @RequestParam("b") double b, ModelMap model) {
			
			CalculatorImpl cal = new CalculatorImpl();
			
			double result = cal.multiply(a, b);
			
			model.addAttribute("result", result);
			return "calcResult";
		}
		
		@RequestMapping(value = "/divide", method = RequestMethod.POST)
		public String divide(@RequestParam("a") double a, @RequestParam("b") double b, ModelMap model) {
			
			CalculatorImpl cal = new CalculatorImpl();
			
			double result = cal.divide(a, b);
			model.addAttribute("result", result);
			return "calcResult";
		}
		
	}
