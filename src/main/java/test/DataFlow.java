package test;

public class DataFlow {
	private int id;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	void modifyId(){
		id = 20;
	}

	public int readId(){
		return id;
	}
}
