package SpringBoot.SpringBoot_Basic.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanConsumer {

	@Autowired
	public MyBeanConsumer(MyBean myBean) {
		System.out.print("Hello Sokphorn are you testing on Bean right?");
		System.out.print(myBean.hashCode());
	}
	
}
