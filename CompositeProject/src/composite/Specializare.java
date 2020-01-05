package composite;


public class Specializare {
	
	public static IA InfoAplicataS= new IA();
	public static IA InfoAplicataP= new IA();
	public static IA InfoAplicata= new IA();
	public static A AutomaticaS=new A();
	public static A AutomaticaP=new A();
	public static A Automatica=new A();
	public static IS IngSis=new IS();
	

	public static void main(String[] args) {
		
		//declarare si initializare studenti si profesori
		Sia sia1= new Sia("Popescu Ion",1);
		Sia sia2= new Sia("Ionescu Vasile",2);
		Pia pia1=new Pia("Onea Alexandru",11,"Sisteme Automate cu Esantionare");
		Pia pia2=new Pia("Dosoftei Catalin",12,"Masini si actionari electrice");
		Sa sa1= new Sa("Manolache Andrei",3);
		Sa sa2= new Sa("Voievod Stefan",4);
		Pa pa1=new Pa("Mastacan Lucian",13,"Masurari si Instrumentatie");
		Pa pa2=new Pa("Postolache Mihai",14,"Sisteme cu microprocesoare");
		
		
		//realizarea arborelui composite
		
		//lista cu studenti de la Informatica Aplicata
		
		InfoAplicataS.addAC(sia1);
		InfoAplicataS.addAC(sia2);
		
		//lista cu profesori de la Informatica Aplicata
		
		InfoAplicataP.addAC(pia1);
		InfoAplicataP.addAC(pia2);
		
		//lista cu studenti si profesori de la Informatica Aplicata, realizata prin adaugarea intr-o noua liste a celor doua liste deja create mai sus
		//avantaj structura arbore composite
		
		InfoAplicata.addAC(InfoAplicataS);
		InfoAplicata.addAC(InfoAplicataP);
		
		//lista cu studenti de la Automatica
		
		AutomaticaS.addAC(sa1);
		AutomaticaS.addAC(sa2);
		
		//lista cu profesori de la Automatica
		
		AutomaticaP.addAC(pa1);
		AutomaticaP.addAC(pa2);
		
		//lista cu studenti si profesori de la Automatica, realizata prin adaugarea intr-o noua lista a celor doua liste deja create mai sus
		
		Automatica.addAC(AutomaticaS);
		Automatica.addAC(AutomaticaP);
		
		//lista cu studenti si profesori de la ambele specializari
		
		IngSis.addAC(InfoAplicata);
		IngSis.addAC(Automatica);
		IngSis.showDetails();
		
		//System.out.println(IngSis.toString());
		
		//aplicatie grafica pentru prezentarea intr-un mod interactiv a exemplului creat
		Grafic g = new Grafic();
		g.initialize();
		

	}

}
