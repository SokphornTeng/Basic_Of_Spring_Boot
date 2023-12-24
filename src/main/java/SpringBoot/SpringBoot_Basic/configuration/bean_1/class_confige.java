package SpringBoot.SpringBoot_Basic.configuration.bean_1;

import org.springframework.beans.factory.annotation.Autowired;

public class class_confige {

	@Autowired
	public class_confige(class_obj classObj) {
		System.out.print(classObj.hashCode());
	}
	
}
