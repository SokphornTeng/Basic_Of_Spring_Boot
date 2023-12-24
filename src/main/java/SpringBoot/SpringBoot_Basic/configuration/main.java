package SpringBoot.SpringBoot_Basic.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext newBean1 = new AnnotationConfigApplicationContext();
		newBean1.register(MyBean.class);
		newBean1.refresh();
		newBean1.close();

	}

}
