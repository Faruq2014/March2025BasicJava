package method;

public class VoidAndReturnMethod {

	public static void main(String[] args) {
		// deduct transferBalance
		double transferBalance=3000.00;
				
		VoidAndReturnMethod vrm= new VoidAndReturnMethod();
		vrm.calculateCheckingAC();
		
		
		double checkingBalance=vrm.calculateCheckingACOne();
		double netBalance=checkingBalance-transferBalance;
		System.out.println("net balance of the day is "+ netBalance );
		
		// since calculateCheckingACOne is a return type method-- thats why we are able to
		// do modification 
       
		// on the other hand calculateCheckingAC is a void method as a result
		// it returns nothing. means we can not modify.
	}
	
	/**
	 * this method will calculate use checking account as soon as 
	 * it has new deposits
	 */
	/*
			 * Characteristics of Void Methods
		No Return Value → Cannot return any value (e.g., return 5; is not allowed).
		Performs an Action → Typically used for printing, modifying objects, 
		or performing calculations without returning results.
		Can Have Parameters → Void methods can accept parameters to perform tasks.
			 */
	public void calculateCheckingAC() {
		double currentBalance=5000.00;
		float newDepositToday=4000.00f;
		double totaBalance=currentBalance+newDepositToday;
		System.out.println("total balance "+ totaBalance);
	}
	/*
	 * Every method must declare a return type.
		The return type must match the returned value.
		A non-void method must include a return statement.
		Primitive and object types can be returned.
		Java allows covariant return types in overridden methods.
		Use Optional<T> to avoid null values.
	 */
	public double calculateCheckingACOne() {
		double currentBalance=5000.00;
		float newDepositToday=4000.00f;
		double totaBalance=currentBalance+newDepositToday;
		System.out.println("total balance "+ totaBalance);
		return totaBalance;
		

		
	}
	

}









