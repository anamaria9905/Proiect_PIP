package composite;

//student A
public class Sa implements AC{
	
	private String name;
	private int id;
	public Sa(String nume, int id1) {
		this.name=nume;
		this.id=id1;
	}
	public void showDetails() {
		System.out.println("id:"+id+"\t"+"Name: "+name);
	}
	

}
