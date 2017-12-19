package br.com.kilian.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "Hello uíl";
	}
	
}
