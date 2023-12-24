package Basic.Spring.Boot.My_Spring_Boot_Basic.Basic;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Test1_Controller {

	// Testing on @PathVariable with custom
	
	@GetMapping("/showId/{id}/showName/{name}")
	public String test_1(@PathVariable("name") String testName, @PathVariable("id") Integer testId) {
		return "Showing @PathVariable of name" + testName + "and" + "Showing testId" + testId;
	}
	
	@GetMapping("/v1/{id}")
	public String test_2(@PathVariable(value = "id", required = false) Long testId) {
		return "showing about value of @PathVariable" + testId;
	}
	
	@GetMapping("/v2/{id}")
	public String test_3(@PathVariable(value = "id") Optional<Long> testId) {
		if(testId.isPresent()) {
			return "Test id is : " + testId.get();
		} else {
			return "Test id is missing";
		}
	}
}
