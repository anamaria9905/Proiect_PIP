package composite;

import java.util.ArrayList;
import java.util.List;

public class IA implements AC {

	List<AC> ACList= new ArrayList<AC>();

	public void showDetails() //afiseaza detalii despre componenta(sau componentele) IA
	{
		for(AC comp:ACList)
		{
			comp.showDetails();
			//System.out.println(comp.toString());
		}
	}
	
	public void addAC(AC comp)//adauga componenta IA
	{
		ACList.add(comp);
	}
	
	public void removeAC(AC comp)//sterge componenta IA
	{
		ACList.remove(comp);
	}
	
	public List<AC> getAC()
	{
		return ACList;
	}



}
