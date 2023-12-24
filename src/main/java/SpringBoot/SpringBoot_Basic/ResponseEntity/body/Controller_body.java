package SpringBoot.SpringBoot_Basic.ResponseEntity.body;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_body {

	@GetMapping("/testBody_1")
	public ResponseEntity<String> ResponseEntity_body1(@RequestParam("id") int age){
		
		return ResponseEntity.status(HttpStatus.OK).body("Hi sokphorn");
		
	}
	
	@GetMapping("/testBody_2")
	public ResponseEntity<String> ResponseEntity_body2(@RequestParam("id") int list){
		
		if(keepList(list)) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This is bad request");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("Hello Sokphorn Teng" + " " + showList(list) );
	}

	private boolean keepList(int list) {
		return false;
	}
	
	private boolean showList(int list) {
		return true;
	}
	
}
