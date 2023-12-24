package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listing")
public class Controllers {

//	When we user @RestController we didn't put @ResponseBody but if we don't use @RestController we have to use @controller and @ResponseBody
	
	
	@GetMapping()
	public String list() {
		return "Show about RestController";
	}
	
}
