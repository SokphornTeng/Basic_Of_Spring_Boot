package SpringBoot.SpringBoot_Basic.collectionArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Set {

	@GetMapping("/showSet")
	public Set<String> setData(){
		
		Set<String> dataSet = new HashSet<String>();
		dataSet.add("setData_1");
		dataSet.add("setData_2");
		dataSet.add("setData_3");
		dataSet.add("setData_4");
		dataSet.add("setData_5");
		
		return dataSet;
	}
	
	@GetMapping("/showSet_1")
	public Set<Integer> setData_1(){
		
		Set<Integer> getList = new HashSet<Integer>();
		getList.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 8, 9}));
		
		return getList;
	}
	
	@GetMapping("/showSet_2")
	public Set<Integer> setData_2(){
		
//		combile array into one list
		Set<Integer> getListA = new HashSet<Integer>();
		getListA.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 8, 9}));
		
		Set<Integer> getListB = new HashSet<Integer>();
		getListB.addAll(Arrays.asList(new Integer[] {11, 22, 33 ,44 ,55, 66, 77, 88}));
		
		Set<Integer> getListC = new HashSet<Integer>(getListA);
		getListC.addAll(getListB);
		return getListC;
	}
	
}
