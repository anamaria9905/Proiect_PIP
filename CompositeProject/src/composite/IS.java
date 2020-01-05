package composite;

import java.util.ArrayList;
import java.util.List;

public class IS implements AC{

	List<AC> ACList= new ArrayList<AC>();

	//afiseaza detalii despre componentele(una-obiect propriu-zis, sau mai multe) listei IS
	public void showDetails() {
		for(AC comp:ACList)
		{
			comp.showDetails();
			//System.out.println(comp.toString());
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


