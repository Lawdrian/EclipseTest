/**
 * 
 * @author Adrian Wild
 * @date 29.04.21
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartNumber smartNumber = new SmartNumber();
		//Test der Methoden
		System.out.println("Test der Methoden:");
		smartNumber.setNumber(1.5);
		System.out.println("Nummer lautet: " + smartNumber.getNumber());
		System.out.println("Ist 1.5 ein Integer? " + smartNumber.isInteger(1.5));
		smartNumber.isEven();
		
		smartNumber.setNumber(4);
		System.out.println("Ist 4 ein Integer? " + smartNumber.isInteger(4));
		System.out.println("Ist 4 eine gerade Zahl? " + smartNumber.isEven());
		
		
		System.out.println();
		System.out.println("Primzahlen zwischen 2 und 20:");
		
		
		
		
		// Berechnung der Primzahlen zwischen 2 und 20
		
		for(int i = 2; i<=20;i++) {
			smartNumber.setNumber(i);
			smartNumber.isPrime();
		} // for
		
		
		/**
		 * 
		 * Die Methode isInteger könnte statisch geschrieben sein, da sie im Gegensatz 
		 * zu den anderen Methoden einen Übergabeparameter hat und somit die Instanzvariable 
		 * überhaupt nicht verwendet.
		 * 
		 * isEven und isPrime könnte man theoretisch auch als statische Methoden schreiben.
		 * Dafür müsste man jedoch die Methoden ändern, damit sie ein double als Übergabeparameter fordern.
		 */
		
		
		
		
	} // main

}
