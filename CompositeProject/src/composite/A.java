package composite;
import java.util.ArrayList;
import java.util.List;

public class A implements AC {

	private List<AC> ACList= new ArrayList<AC>();
	
	public void showDetails() //afiseaza detalii despre componenta A
	{
		for(AC comp:ACList)
		{
			comp.showDetails();
		}
	}
	
	public void addAC(AC comp)//adauga componenta A
	{
		ACList.add(comp);
	}
	
	public void removeAC(AC comp)//sterge componenta A
	{
		ACList.remove(comp);
	}
}
