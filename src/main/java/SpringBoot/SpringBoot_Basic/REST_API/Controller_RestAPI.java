package SpringBoot.SpringBoot_Basic.REST_API;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/restApi")
public class Controller_RestAPI {
	
	@Autowired
	private class_C cc;
	
	@GetMapping(value="/", produces = "application/json")
	public class_B listBB() {
		return cc.getB();
	}
	
	@PostMapping(value="/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addObject(@RequestBody class_A objA){
		
		Integer id = cc.getB()
				       .getAbb()
				       .size() + 1;
		
		objA.setId(id);
		
		cc.addObject(objA);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				                                  .path("/{id}")
				                                  .buildAndExpand(objA.getId())
				                                  .toUri();
		return ResponseEntity.created(location).build();
	}
}
