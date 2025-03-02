package variable;

public class LocalVariable {
  /* variable is a place holder where we initialize the value to calculate
   * local variable declaration always inside the method =	int milk
   * local variable must initialize =int milk=5;
   * local variable life is inside the method
   * you must declare data type
   * local variable is a private variable
   * only final is allow for modifier
 
   */
	public static void main(String[] args) {
		
		LocalVariable lv = new LocalVariable(); //class referential variable
		// class name cn= new class name();
		lv.groceries();
	}
	
	
	public void groceries() {
		
       int milk=5;
		// int is the data type
       // milk is the variable name
       // = is the operator
       // 5 is the value
	
		double egg=2.99;
		double spent=milk+egg;
		System.out.println(" total spent "+spent);
		
	}
	
	

}
