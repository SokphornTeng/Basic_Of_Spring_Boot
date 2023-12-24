package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"list", "list1"})
public class Controller_2 {

	@GetMapping
	public String listing() {
		return "Show me more about multiple mapping";
	}
	
	@GetMapping({"/route1", "/route2"})
	public String dataList() {
		return "Hi Sokphorn";
	}
}
