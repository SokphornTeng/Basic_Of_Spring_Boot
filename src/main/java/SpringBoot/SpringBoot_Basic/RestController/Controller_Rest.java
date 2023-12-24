package SpringBoot.SpringBoot_Basic.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Rest {

	private List<class_list> showList = new ArrayList<class_list>();
	
	@RequestMapping("/getList_1")
	public List<class_list> show_11() {
		showList.add(new class_list(1, "Show_1", "Show_2", "Show_3"));
		showList.add(new class_list(2, "Show_11", "Show_22", "Show_33"));
		showList.add(new class_list(3, "Show_13", "Show_21", "Show_32"));
		showList.add(new class_list(4, "Show_14", "Show_26", "Show_30"));
		showList.add(new class_list(5, "Show_16", "Show_27", "Show_39"));
		return showList;
	}
	
	
	@RequestMapping(value="/getList_2", method = RequestMethod.POST)
	public class_list show_22(class_list noteList) {
		 showList.add(noteList);
		 return noteList;
	}
	
	@RequestMapping("/getList_1/getList_33/{id}")
	public class_list show_33(@PathVariable Long id) {
		return showList.stream().filter(noteList -> noteList.getId().equals(id)).findFirst().get();
	}
	
}
