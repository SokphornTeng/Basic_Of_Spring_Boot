package SpringBoot.SpringBoot_Basic.REST_API;

import org.springframework.stereotype.Repository;

@Repository

public class class_C {

	private static class_B bcc = new class_B();
	
	static {
		bcc.getAbb().add(new class_A(1, "Sokphorn", 25));
		bcc.getAbb().add(new class_A(2, "Tola", 26));
		bcc.getAbb().add(new class_A(3, "Vuthe", 19));
		bcc.getAbb().add(new class_A(4, "Pila", 40));
		
	}
	
	public class_B getB() {
		return bcc;
	}
	
	public void addObject(class_A objA) {
		bcc.getAbb().add(objA);
		
	}
	
}
