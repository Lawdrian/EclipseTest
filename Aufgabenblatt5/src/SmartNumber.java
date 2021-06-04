
/***
 * 
 * @author Adrian Wild
 * @date   29.04.21
 */



public class SmartNumber {

	//Instanzvariablen
	private double number;
	
	
	// Konstruktoren
	public SmartNumber() {
		
	} // SmartNumber
	
	public SmartNumber(double number) {
		this.number = number;
	} // SmartNumber
	
	
	
	
	// Prüft, ob die übergebene Zahl ein Integer ist
	protected boolean isInteger(double x) {
	  if( x==(int)x) {
		  return true;
	  }//if
	  return false; 
	} // isInteger
	
	
	// Setter
	protected void setNumber(double number) {
		this.number = number;
	} // setNumber
	
	
	// Getter
	protected double getNumber() {
		return this.number;
	} //getNumber
	
	
	// Prüft ob number eine gerade und ganzzahlige Zahl ist
	protected boolean isEven() {
		if (isInteger(this.number)) {
			if(isInteger(this.number/2)) {
				return true;
			} // if
			else { 
				return false;
			} // else
		} // if
		else {
			System.out.println("isEven: Zahl " + this.number + " ist nicht ganzzahlig ");
			return false;
		} // else
	} //isEven
	
	// Prüft ob number eine Primzahl ist
	protected boolean isPrime() {
		if(this.number>1 && isInteger(this.number)) {
			for(int i=2; i <= 0.5*this.number;i++) {
				if(this.number%i == 0) {
					return false;
				} // if
			} // for
			System.out.println("isPrime: Zahl " + this.number + " ist eine Primzahl ");
			return true;
		} // if
		System.out.println("isPrime: Zahl " + this.number + " ist nicht ganzzahlig oder zu klein ");
		return false;
	} // isPrime
	
	
	
	
	
	
} // SmartNumber
