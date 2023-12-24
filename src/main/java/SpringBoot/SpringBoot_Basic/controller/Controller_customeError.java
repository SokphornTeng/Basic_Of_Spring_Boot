package SpringBoot.SpringBoot_Basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_customeError implements ErrorController {
    
	@GetMapping("/error")
	public ResponseEntity<Map<String, Object>> showErrorPage(){
		Map<String, Object> error = new HashMap<>();
		error.put("error", 404);
		error.put("message", "Not Found!");
		
		return ResponseEntity.status(404).body(error);
	}
}
