package Basic.Spring.Boot.My_Spring_Boot_Basic.Basic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test4")
public class Test4_Controller {

	@RequestMapping(value = "id", method = RequestMethod.GET, headers = "key=values")
	public ResponseEntity<String> test_1(@PathVariable("id") Long testId, HttpServletRequest request){
		
		return ResponseEntity.ok("Test Id : " + testId);
	}
	
}
