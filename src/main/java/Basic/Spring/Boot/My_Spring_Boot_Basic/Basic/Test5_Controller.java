package Basic.Spring.Boot.My_Spring_Boot_Basic.Basic;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test5")
public class Test5_Controller {

	//test5?id=3
	
	@GetMapping
	public String test_1(@RequestParam Long id, @RequestParam String name, @RequestParam String email) {
		return "Id" + id + "Name" + name + "Email" + email;
	}
	
	@GetMapping("/v1")
	public String test_2(@RequestParam("_id") Long id, @RequestParam("_name") String name, @RequestParam("_email") String email) {
		return "Id" + id + "Name" + name + "Email" + email;
	}
	
	@GetMapping("/v2")
	public String test_3(@RequestParam(value = "id", required = false) Long TestId, @RequestParam("_name") String name, @RequestParam("_email") String email) {
		
		Long TestingId;
		
		if(TestId == null) {
			TestingId = (long) Math.floor(Math.random() * 10);
		} else {
			TestingId = TestId;
		}
		return "Id" + TestId + "Name" + name + "Email" + email; 
	}
	
	@GetMapping("/v3")
    public String test_4(@RequestParam(value = "id", required = false) Optional<Long> TestId) {
		// if not have id it will random id
    	Long TestingId = TestId.orElse((long) Math.floor(Math.random() * 1000));
    	return "Id" + TestId + "and" + TestingId;
	}
	
	@GetMapping("/v4")
	public String test_5(@RequestParam(value = "id", required = false, defaultValue = "7") Long TestId) {
		return "Showing Test Id with default" + TestId;
	}
	
	@GetMapping("/v5")
	public String test_6(@RequestParam Map<String, Object> Testing) {
		return "Map" + Testing.getOrDefault("_id", "700") + Testing.getOrDefault("Practice", "Sokphorn");
	}
	
	@GetMapping("/v6")
	public String test_7(@RequestParam(required = false, defaultValue = "1,2,3") List<Long> testId) {
		return "My testing" + testId;
		//My testing[1, 2, 3]
	}
	
}
