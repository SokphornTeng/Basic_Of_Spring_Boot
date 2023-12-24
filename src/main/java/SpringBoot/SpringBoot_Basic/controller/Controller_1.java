package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_1 {
   
//	@GetMapping("/hi")
//	We use @GetMapping it get all method and instead of @RequestMapping
//	@RequestMapping("/hello")
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	
	public String sample() {
		
		return "Show you about diferent of GetMapping and RequestMapping";
	}
	
}
