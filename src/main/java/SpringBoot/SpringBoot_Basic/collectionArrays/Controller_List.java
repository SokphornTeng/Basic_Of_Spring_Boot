package SpringBoot.SpringBoot_Basic.collectionArrays;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_List {

	@GetMapping("/showList")
	public List<String> list() {
		
//		Set is allow unique object not duplicate and it allow only one null of element
		List<String> dataList = new ArrayList<>();
		dataList.add("show1");
		dataList.add("Show2");
		dataList.add("show3");
		dataList.add("show4");
		dataList.add("show5");
		
		
		dataList.add(1, "list_1");
		dataList.add(2, "list_2");
		dataList.add(3, "list_3");
		dataList.add(4, "list_4");
		dataList.add(5, "list_5");
		
//		for(String getList : dataList) {
//			return getList;
//		}
		
//		int lengthSum = 0;
//		for (String str: dataList) {
//		 lengthSum += str.length();
//		}
		
//		for (int i=0; i<dataList.size(); i++) {
//			 String str = dataList.get(i);
//			   return str
//			}
		
		return dataList;
		
//		return with below as get index but need to change data of method into String
//		return dataList.get(3);
//		return dataList.size();
		
	}
	
}
