package composite;

public class Sia implements IS {

	
	private String name;
	private int id;
	public Sia(String nume, int id1) {
		this.name=nume;
		this.id=id1;
	}
	public void showDetails() {
		System.out.println(id+" "+name);
		
	}
	

}
