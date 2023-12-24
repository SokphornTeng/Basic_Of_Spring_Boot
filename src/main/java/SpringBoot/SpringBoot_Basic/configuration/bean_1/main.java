package SpringBoot.SpringBoot_Basic.configuration.bean_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext beans = new AnnotationConfigApplicationContext();
		beans.register(class_obj.class);
		beans.refresh();
		beans.close();

	}

}
