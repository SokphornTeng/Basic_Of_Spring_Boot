package SpringBoot.SpringBoot_Basic.RestController;

public class class_list {

	private Long id;
	private String list_1;
	private String list_2;
	private String list_3;
	
	public class_list(int id, String list_1, String list_2, String list_3) {
	    this.list_1 = list_1;
	    this.list_2 = list_2;
	    this.list_3 = list_3;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getList_1() {
		return list_1;
	}
	public void setList_1(String list_1) {
		this.list_1 = list_1;
	}
	public String getList_2() {
		return list_2;
	}
	public void setList_2(String list_2) {
		this.list_2 = list_2;
	}
	public String getList_3() {
		return list_3;
	}
	public void setList_3(String list_3) {
		this.list_3 = list_3;
	}
	
}
