package SpringBoot.SpringBoot_Basic.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Pathviraible {
   
	@GetMapping("/hi/{id}")
	public String show01(@PathVariable String id) {
		return id;
	}
	
	@GetMapping("/hello/{i}")
	public String show02( @PathVariable("i") String useId ) {
		return useId;
	}
	
	@GetMapping("/welcome/{id}")
	public String show03(@PathVariable(value="id") String listId) {
		return listId;
	}
	
	@GetMapping("/greeting/{fId}/{gId}")
	public String show04(@PathVariable String fId, @PathVariable String gId) {
		return fId + gId;
	}
	
	@GetMapping("/nice/{num}/{name}")
	public String show05(@PathVariable Map<String, String> getDataList) {
		String num = getDataList.get("num");
		String name = getDataList.get("name");
		if (num != null && name != null) {
			return num + name;
		} else {
			return "sorry no data empy";
		}
		
	}
}
