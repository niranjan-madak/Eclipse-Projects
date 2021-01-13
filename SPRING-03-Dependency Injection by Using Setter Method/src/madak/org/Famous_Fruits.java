package madak.org;

public class Famous_Fruits {
	private String fruit_name, Finding_location;
	
	public Famous_Fruits() {}

	
	public String getFruit_name() {
		return fruit_name;
	}

	
	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}

	public String getFinding_location() {
		return Finding_location;
	}

	
	public void setFinding_location(String finding_location) {
		this.Finding_location = finding_location;
	}
	
	public void displayInfo() {
		System.out.println(" Fruit :"+fruit_name+" "+"Location :"+Finding_location);
	}
	
	

}
