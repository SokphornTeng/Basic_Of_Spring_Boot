package SpringBoot.SpringBoot_Basic.configuration.bean_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class class_bean {

	@Bean
	public class_obj classObj() {
		return new class_obj();
	}
	
	public class_confige classConfige() {
		return new class_confige(classObj());
	}
}
