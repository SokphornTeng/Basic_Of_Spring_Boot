package SpringBoot.SpringBoot_Basic.configuration.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class class_createObject {

	@Bean
	public class_object classObject() {
		return new class_object();
	}
	
	@Bean
	public class_injectionObject classInj() {
		return new class_injectionObject(classObject());
	}
	
}
