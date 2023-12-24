package SpringBoot.SpringBoot_Basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Controller_RequestParam {

	@GetMapping("/me")
	public String list1(@RequestParam String name) {
		return name;
	}
	@GetMapping("/showMe")
	public String list2(@RequestParam String data1, @RequestParam String data2) {
		return data1 + data2;
	}
	@GetMapping("/showMe1")
	public String list3(@RequestParam(name="id") String me1, @RequestParam String me2) {
		return me1 + me2;
	}
//	Defualt value of param
	@GetMapping("/teach")
	public String list4(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("nice") String nice ) {
		return id + name + nice;
	}
	
//	@GetMapping("/teachMe")
//	public String list5(@RequestParam( value="id", required = false) int dataId,  @RequestParam("name") String name, @RequestParam("nice") String nice ) {
//		
//		int getListId;
//		
//		if(dataId != null) {
//			getListId = (int) Math.floor(Math.random() * 10000);
//		}else {
//			getListId = dataId;
//		}
//	}
	
}
