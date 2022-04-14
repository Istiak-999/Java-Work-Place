package company;

 public class Salary {
	
	static int basic;
	static double rent;
	final static int allowance=10000;
	//double extra;
	static double total;
	static double totalSalary(int b){
		
		basic=b;
		rent=0.5*basic;
	    total=basic+rent+allowance;
	    return total;
	}
	
	


}
