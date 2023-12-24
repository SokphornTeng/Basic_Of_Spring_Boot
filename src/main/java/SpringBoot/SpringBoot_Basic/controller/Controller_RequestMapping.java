package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/stu")
public class Controller_RequestMapping {

	@GetMapping("/{id}")
	public ResponseEntity<String> student_1(@PathVariable("id") long stuId) {
		
		return ResponseEntity.ok("Student Id" + stuId);
	}
	
//	not know about HttpServletRequest
	@RequestMapping(value="/{id}", method= RequestMethod.GET, headers = "key=valid")
	public ResponseEntity<String> student_2(@PathVariable("id") long listID, HttpServletRequest request) {
		System.out.print(request.getHeader("helloo"));
		return ResponseEntity.ok("teacher Id" + listID);
	}
	
	@RequestMapping(value="/show1", headers = {"key=comment", "key=love"}, method = RequestMethod.GET)
	public String student_3() {
		return "Hi all friend";
	}
}
