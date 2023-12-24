package SpringBoot.SpringBoot_Basic.file_json_postman;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_file_json {

//	@GetMapping("/json_test")
//	public ResponseEntity<String> testJson( @RequestBody class_fileJson json){
//		return ResponseEntity.ok().body(json.getName() + json.getAge() + json.getPosition());
//	}
	
	@PostMapping("/hi")
	public ResponseEntity<String> testFile(@RequestPart("listData") class_fileJson file){
		return ResponseEntity.ok().body( file.getName() + file.getAge() + file.getPosition());
	}
}
