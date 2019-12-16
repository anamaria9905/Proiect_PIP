package composite;

public class Pa implements AC {
	private String name;
	private int id;
	private String course;
	public Pa(String nume, int id1, String c ) {
		this.name=nume;
		this.id=id1;
		this.course=c;
	}
	public void showDetails() {
		System.out.println("id:"+id+"\t"+"Name: "+name+"\t"+"Course: "+course);
	}

}
