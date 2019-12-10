package composite;
import java.util.ArrayList;
import java.util.List;

public class A implements IS {

	private List<IS> ISList= new ArrayList<IS>();
	
	public void showDetails() //afiseaza detalii despre componenta A
	{
		for(IS comp:ISList)
		{
			comp.showDetails();
		}
	}
	
	public void addIS(IS comp)//adauga componenta A
	{
		ISList.add(comp);
	}
	
	public void removeIS(IS comp)//sterge componenta A
	{
		ISList.remove(comp);
	}
}
