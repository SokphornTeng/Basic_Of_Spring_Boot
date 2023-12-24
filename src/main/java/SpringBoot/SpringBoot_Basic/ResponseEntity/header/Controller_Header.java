package SpringBoot.SpringBoot_Basic.ResponseEntity.header;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Header {

	@GetMapping("/header1")
	public ResponseEntity<String> ResponseEntity_header1(){
		
		HttpHeaders header_1 = new HttpHeaders();
		header_1.add("name", "sokphorn");
	    
		HttpHeaders header_2 = new HttpHeaders();
		header_2.add("age", "25");
		
		return new ResponseEntity<String>("This is my header test" + " " + header_1 + " " + "and" + " " + header_2 , HttpStatus.OK);
	}
	
}
