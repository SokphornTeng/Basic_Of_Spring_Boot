package SpringBoot.SpringBoot_Basic.REST_API.test_restAPI;

public class gradeMother {

	private int id;
	private String name;
	
	gradeMother(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
