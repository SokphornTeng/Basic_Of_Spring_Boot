package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.SpringBoot_Basic.model.request.loginFormRequest;
import SpringBoot.SpringBoot_Basic.model.response.LoginResponse;

@RestController
public class Controller_login {

	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody loginFormRequest loginData) {
		
		LoginResponse res = new LoginResponse();
//		We show response what we want from serve as we show object below
		res.userName = loginData.username.toUpperCase();
		
		return ResponseEntity.ok(res);
	}
	
	
}
