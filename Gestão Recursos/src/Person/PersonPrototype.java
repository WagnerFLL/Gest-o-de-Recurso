package Person;

public abstract class PersonPrototype {
	
	public abstract PersonPrototype clonar();
	
	private String name;
	private int ID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
}
