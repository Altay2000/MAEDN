
public class Spielerklasse {

	Figur figur1;
	Figur figur2;
	Figur figur3;
	Figur figur4;
	
	Wuerfel wuerfel1 = new Wuerfel();
	int Augenzahl;
	
	String name;
	
	Spielerklasse Nachfolger;
	
	
	public void zugstarten() {
		Augenzahl = wuerfel1.wuerfeln();
		
	}
	
	public void benennen() {
		
		//name = //manuelle Eingabe
	}

	public void setzeNachfolger(Spielerklasse NF) {
		
		Nachfolger = NF;
	}
	
}
