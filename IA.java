package composite;

import java.util.ArrayList;
import java.util.List;

public class IA implements IS {

	List<IS> ISList= new ArrayList<IS>();

	public void showDetails() //afiseaza detalii despre componenta IA
	{
		for(IS comp:ISList)
		{
			comp.showDetails();
		}
	}
	
	public void addIS(IS comp)//adauga componenta IA
	{
		ISList.add(comp);
	}
	
	public void removeIS(IS comp)//sterge componenta IA
	{
		ISList.remove(comp);
	}



}
