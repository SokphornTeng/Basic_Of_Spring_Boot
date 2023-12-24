package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.SpringBoot_Basic.model.request.loginFormRequest;

@RestController
@RequestMapping("/auth")
public class Controller_3 {

	@PostMapping("/login")
	public ResponseEntity login(@RequestBody loginFormRequest loginData) {
		return ResponseEntity.ok(loginData);
//		ResponseEntity.ok -> status 200
	}
	
	
}
