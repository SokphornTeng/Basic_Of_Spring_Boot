package SpringBoot.SpringBoot_Basic.ResponseEntity.Header_Body;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class header_body {

	@GetMapping("/test_body_header")
	public ResponseEntity<String> header_body_1(){
		return  ResponseEntity.ok()
				.header("list", "student")
		        .body("Hello this is my body");
	}
	
	
	@GetMapping("test_01")
	public void test(HttpServletResponse response) throws IOException{
		response.setHeader("name", "Sokphorn_KH");
		response.setStatus(200);
		response.getWriter().println("Hello Sokphorn KH");
	}
	
	
}
