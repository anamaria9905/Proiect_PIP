package composite;

import java.util.ArrayList;
import java.util.List;

public class IS implements AC{

	List<AC> ACList= new ArrayList<AC>();

	public void showDetails() {
		for(AC comp:ACList)
		{
			comp.showDetails();
		}
	}

	public void addAC(AC comp)//adauga componenta IS
	{
		ACList.add(comp);
	}

	public void removeAC(AC comp)//sterge componenta IS
	{
		ACList.remove(comp);
	}

}


