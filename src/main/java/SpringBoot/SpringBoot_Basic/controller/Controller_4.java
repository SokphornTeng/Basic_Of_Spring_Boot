package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_4 {
	
	
//	we use PathViriabel for take data one by one
	@GetMapping("/data/{id}")
	public String getDataList(@PathVariable String id) {
		return id;
	}
}
