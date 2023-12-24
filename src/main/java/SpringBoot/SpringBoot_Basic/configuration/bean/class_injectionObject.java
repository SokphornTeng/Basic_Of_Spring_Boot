package SpringBoot.SpringBoot_Basic.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class class_injectionObject {

	@Autowired
	public class_injectionObject(class_object classObject) {
	   System.out.println("Hi Sokphorn" + classObject);	
	}
	
}
