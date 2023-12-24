//package SpringBoot.SpringBoot_Basic.REST_API.test_restAPI;
//
//import java.net.URI;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//@RestController
//public class controller_testRestAPI {
//
//	@Autowired
//	private child baby;
//	
//	public mother family() {
//		return baby.mama();
//	}
//	
//	public ResponseEntity<Object> inLaw( @RequestBody gradeMother yay){
//		
//		Integer id = baby.mama()
//				         .getMom()
//				         .size() + 1; 
//		yay.setId(id);
//		baby.inLaw(yay);
//		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//				                                  .path("{id}")
//				                                  .buildAndExpand(yay.getId())
//				                                  .toUri();
//		return ResponseEntity.created(location).build();
//		
//	}
//}
