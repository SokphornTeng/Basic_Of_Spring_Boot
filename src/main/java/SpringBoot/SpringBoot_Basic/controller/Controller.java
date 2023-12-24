package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// @requestmapping(show1) is route first and for all other method
@org.springframework.stereotype.Controller
@ResponseBody
@RequestMapping("sample")
public class Controller {
   
//	@GetMapping is for method as Post Get Delete and Update
	@GetMapping
	public String show() {
		return "Hello world!...";
	}
}
