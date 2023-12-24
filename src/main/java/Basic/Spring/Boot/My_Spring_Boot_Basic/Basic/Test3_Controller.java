package Basic.Spring.Boot.My_Spring_Boot_Basic.Basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test3")
public class Test3_Controller {

	// show about sample of GetMapping
	
	@GetMapping	
  // @RequestMapping(value = "/", method = RequestMethod.GET)
	public String test_1() {
		return "Showing about different of use GetMapping and RequestMapping";
	}
	
	
	@GetMapping("/v1")
	public String test_2() {
		return "This is my showing and testing";
	}
	
	//we can use v2 and v3 but can't use together
	@GetMapping({"/v2", "/v3"})
	public String test_3() {
		return "This is my practice";
	}
}
