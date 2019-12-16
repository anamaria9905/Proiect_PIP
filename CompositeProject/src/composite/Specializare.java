package composite;

public class Specializare {

	public static void main(String[] args) {
		Sia sia1= new Sia("Popescu Ion",1);
		Sia sia2= new Sia("Ionescu Vasile",2);
		Pia pia1=new Pia("Onea Alexandru",11,"Sisteme Automate cu Esantionare");
		Pia pia2=new Pia("Dosoftei Catalin",12,"Masini si actionari electrice");
		Sa sa1= new Sa("Manolache Andrei",3);
		Sa sa2= new Sa("Voievod Stefan",4);
		Pa pa1=new Pa("Mastacan Lucian",13,"Masurari si Instrumentatie");
		Pa pa2=new Pa("Postolache Mihai",14,"Sisteme cu microprocesoare");
		
		
		
		IA InfoAplicataS= new IA();
		InfoAplicataS.addAC(sia1);
		InfoAplicataS.addAC(sia2);
		
		IA InfoAplicataP= new IA();
		InfoAplicataP.addAC(pia1);
		InfoAplicataP.addAC(pia2);
		
		IA InfoAplicata= new IA();
		InfoAplicata.addAC(InfoAplicataS);
		InfoAplicata.addAC(InfoAplicataP);
		
		A AutomaticaS=new A();
		AutomaticaS.addAC(sa1);
		AutomaticaS.addAC(sa2);
		
		A AutomaticaP=new A();
		AutomaticaP.addAC(pa1);
		AutomaticaP.addAC(pa2);
		
		A Automatica=new A();
		Automatica.addAC(AutomaticaS);
		Automatica.addAC(AutomaticaP);
		
		IS IngSis=new IS();
		IngSis.addAC(InfoAplicata);
		IngSis.addAC(Automatica);
		IngSis.showDetails();
		
		Grafic g = new Grafic();
		g.initialize();
		

	}

}
