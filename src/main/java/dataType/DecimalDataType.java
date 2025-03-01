package dataType;

public class DecimalDataType {

	public static void main(String[] args) {
	
		// i have 1000.00, tv=599.99, tvStand=99.99
		// decimal --> double and float
		double have=1000.00;
		
		double tv=599.99;
		float tvStand=99.99f;
	    double	totalSpent=tv+tvStand;
	     System.out.println("total spent "+totalSpent);
	// float is smaller data type
	// double is bigeer data type
	// for processed variable always use bigger data type
	  double  moneyLeft =have-totalSpent;
	  System.out.println(moneyLeft+" remaining balance");
	 
	     
		
	}

}
