package SpringBoot.SpringBoot_Basic.configuration.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
	   
		AnnotationConfigApplicationContext bean1 = new AnnotationConfigApplicationContext();
		bean1.register(class_object.class);
		bean1.refresh();
		bean1.close();

	}

}
