package variable;

public class StaticVariable {
	/*declaration== inside the class but out side of the method
	 * Initialization= is not mandatory, but preferred
	 * static word in-fort of it make it static
	 * modifier== any access modifier is allow
	 * scope == allow for whole class
	 * 
	 */
	
	 private  String firstName;
	 private static String lastName="Molla";
	 
	 
	public static void main(String[] args) {
		StaticVariable sv= new StaticVariable();
		sv.fabiha();
		sv.faiza();
	}
	
public void fabiha() {
		
		firstName="Fabiha";
		
		System.out.println(firstName+ " is my first name");
		System.out.println(lastName+ " is my last name");
		
	}
	
	public void faiza() {
		
		firstName="Faiza";
		System.out.println(firstName+ " is my first name");
		System.out.println(lastName+ " is my last name");
	}
	
	

}
