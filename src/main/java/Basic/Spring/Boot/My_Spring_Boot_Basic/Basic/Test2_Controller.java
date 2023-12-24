package Basic.Spring.Boot.My_Spring_Boot_Basic.Basic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2_Controller {

	//custom error of status
	
	@GetMapping("/error")
	public ResponseEntity<Map<String, Object>> handleError(){
		Map<String, Object> error = new HashMap<>();
		error.put("error", 404);
		error.put("message", "Sorry it Not Found");
		
		return ResponseEntity.status(404).body(error);
	}
	
	
	//{
	   // "error": 404,
	   // "message": "Sorry it Not Found"
	//}
	
}
