package composite;

//student IA
public class Sia implements AC {

	
	private String name;
	private int id;
	public Sia(String nume, int id1) {
		this.name=nume;
		this.id=id1;
	}
	
	//afiseaza detaliile despre student IA
	public void showDetails() {
		System.out.println("id:"+id+"\t"+"Name: "+name);
	}
	
	@Override
	public String toString() {
		//this.showDetails();
		//text="id:"+id+"\t"+"Name: "+name;
		return new String("id:"+id+"\t"+"Name: "+name);
		//StringBuilder sb=new StringBuilder();
		//sb.append("")
	}

	

}
