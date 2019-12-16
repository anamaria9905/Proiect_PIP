package composite;

//student IA
public class Sia implements AC {

	
	private String name;
	private int id;
	public Sia(String nume, int id1) {
		this.name=nume;
		this.id=id1;
	}
	public void showDetails() {
		System.out.println("id:"+id+"\t"+"Name: "+name);
		name.toString();
		
	}
	
	public String toString() {
		
	}

	

}
