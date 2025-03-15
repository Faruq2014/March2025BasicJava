package method;

public class DynamicMethod {
	

	public static void main(String[] args) {
		
		DynamicMethod dm =new DynamicMethod();
		dm.calculateCheckingAC(3000);
	}
	
	/**
	 * calculate today's balance 
	 * @param todayExpenses 
	 */
	public void calculateCheckingAC(double todayExpenses) {
		double currentBalance=5000.00;
		float newDepositToday=4000.00f;
		double totaBalance=currentBalance+newDepositToday;
		System.out.println("total balance "+ totaBalance);
		double netBalance=totaBalance-todayExpenses;
		System.out.println("today's net balance "+ netBalance );
	}
/*
 * dynamic coding is when we do not know the value of a variable
 * where user will put the value
 */
}
