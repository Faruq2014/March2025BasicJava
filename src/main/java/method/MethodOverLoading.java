package method;

public class MethodOverLoading {

	/*
	 * Method overloading in Java is a feature that allows multiple methods 
	 * to have the same name but different parameters within the same class. The difference can be in:

			The number of parameters
			The type of parameters
			The order of parameters
	 */
	static double  fixedBalance=4000;
	public static void main(String[] args) {
		MethodOverLoading mvr= new MethodOverLoading();
		mvr.getBalance();
		mvr.getBalance(2000.00);
		mvr.getBalance(2000.00, 500);
		mvr.getBalance(2000.00, "Heba");
	}
	// 0 arg method
	//getBalance()--- getBalance() 0 arg method
	public void getBalance() {
		System.out.println("Fixed balance is "+fixedBalance + "zero arg method");
		
	}
	// one arg method
	//getBalance()--- getBalance() one arg method
    public void getBalance(double checkingAC) {
    	double total=fixedBalance + checkingAC;
    	System.out.println("Fixed and checking balance is "+ total + "one arg method");
		
	}
    // two arg method
  //getBalance()--- getBalance() two arg method
    public void getBalance(double checkingAC, int savingAC) {
    	double total=fixedBalance + checkingAC+savingAC;
    	System.out.println("Fixed,checking and saving balance is "+ total + " two arg method");
  	}
    // two arg method
    //getBalance()--- getBalance() two mix arg method
      public void getBalance(double checkingAC, String name) {
    	  
    	  Object total=fixedBalance + checkingAC+name;
      	System.out.println("Fixed,checking balance and name is "+ total + " two mix arg method");
  		
    	}


	
}
