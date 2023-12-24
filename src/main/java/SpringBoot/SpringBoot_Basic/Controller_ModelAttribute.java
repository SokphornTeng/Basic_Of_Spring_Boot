package SpringBoot.SpringBoot_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.SpringBoot_Basic.classItem.Student;

@RestController
public class Controller_ModelAttribute {
   
//	@ModelAttribute("/nices")
////	@GetMapping("/nices")
//	public List<String> practicModelAttribute() {
//		
//		List<String> test1 = new ArrayList<String>();
//		test1.addAll(Arrays.asList(new String[] {"ab","cb","ef","gh","ij"}));
//		
//		return test1;
//	}
	
	Map<String, Student> stuData = new HashMap<String, Student>();
	
	
	@PostMapping(value = "/teng")
	public String test_1(Model model, @ModelAttribute("stu") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "Error hx";
		}
		model.addAttribute("1", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute(25);
		model.addAttribute("school", student.getSchool());
		
		stuData.put(student.getId(), student);
		
		return "testModel";
	}
}
