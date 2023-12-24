package SpringBoot.SpringBoot_Basic.REST_API;

import java.util.ArrayList;
import java.util.List;

public class class_B {

	private List<class_A> abb;

	public List<class_A> getAbb() {
		if(abb == null) {
			abb = new ArrayList<class_A>();
		}
		return abb;
	}

	public void setAbb(List<class_A> abb) {
		this.abb = abb;
	}


	
	
}
