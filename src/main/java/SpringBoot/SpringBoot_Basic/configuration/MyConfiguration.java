package SpringBoot.SpringBoot_Basic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
	
	@Bean
	public MyBeanConsumer myConsumer() {
		return new MyBeanConsumer(myBean());
	}
}
