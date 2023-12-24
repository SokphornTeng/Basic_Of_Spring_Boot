package SpringBoot.SpringBoot_Basic.REST_API.test_restAPI;

import java.util.List;

public class child {

	private static mother mummy = new mother();
	
	static {
		mummy.getMom().add(new gradeMother(1, "Sokphorn"));
		mummy.getMom().add(new gradeMother(2, "Tola"));
		mummy.getMom().add(new gradeMother(3, "Vuthe"));
		mummy.getMom().add(new gradeMother(4, "Soklin"));
	}
	
	public mother mama() {
		return mummy;
	}
	
	public void inLaw(gradeMother yay) {
		
		mummy.getMom().add(yay);
	}
	
}
