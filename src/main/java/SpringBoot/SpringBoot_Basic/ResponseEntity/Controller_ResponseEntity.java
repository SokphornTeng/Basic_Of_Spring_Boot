package SpringBoot.SpringBoot_Basic.ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_ResponseEntity {

	@GetMapping("resIntity_1")
	public ResponseEntity<String> ResponseEntity_1() {
	  return new ResponseEntity<String>("Hello Sokphorn this is Response Entity", HttpStatus.OK);
	}
	
	@GetMapping("resIntity_2")
	public ResponseEntity<String> ResponseEntity_2(@RequestParam("yob") int yearOfBirth){
		
		if(isInFuture(yearOfBirth)) {
			return new ResponseEntity<String>("Year of Birth no have in the Future", HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<String>("This is your Year of Birth" + " " + caculateYOB(yearOfBirth), HttpStatus.OK);
	}

	private boolean isInFuture(int yearOfBirth) {
		return false;
	}
	private boolean caculateYOB(int yearOfBirth) {
		return true;
	}
	
	@GetMapping("/resIntity_3")
	public ResponseEntity<String> ResponseEntity_3(){
		
		return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
	}
}
