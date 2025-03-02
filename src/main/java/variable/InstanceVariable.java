package variable;

public class InstanceVariable {
	/*declaration== inside the class but out side of the method
	 * Initialization= is not mandatory, not preferred
	 * modifier== any access modifier is allow
	 * scope == allow for whole class
	 * 
	 */

	
	  private  String firstName;
	
	public static void main(String[] args) {
		// class name  = new class name();
		InstanceVariable iv=new InstanceVariable();
		//iv is called class referential variable
		iv.fabiha();
		iv.faiza();
	}
  
	public void fabiha() {
		
		firstName="Fabiha";
	
		System.out.println(firstName+ " is my first name");
		
	}
	
	public void faiza() {
		
		firstName="Faiza";
		System.out.println(firstName+ " is my first name");
	}
}
