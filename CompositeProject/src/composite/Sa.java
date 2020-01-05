package composite;

//student A
public class Sa implements AC{
	
	private String name;
	private int id;
	public Sa(String nume, int id1) {
		this.name=nume;
		this.id=id1;
	}
	
	//afiseaza detaliile despre student A
	public void showDetails() {
		System.out.println("id:"+id+"\t"+"Name: "+name);
	}
	
	@Override
	public String toString() {
		//this.showDetails();
		//text="id:"+id+"\t"+"Name: "+name;
		return "id:"+id+"\t"+"Name: "+name;
	}
	

}
