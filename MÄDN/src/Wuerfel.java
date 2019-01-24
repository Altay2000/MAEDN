import java.util.Random;


public class Wuerfel {

	int zahl;
	Random rand= new Random();
	int r;
	
	public int wuerfeln() {
		
		r = rand.nextInt(6);
		zahl = r + 1;
		return zahl;
	}
	
}
