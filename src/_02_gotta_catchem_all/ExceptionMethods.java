package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	static double divide(double d1,  double d2) {
		
		if(d2==0) {
			throw new IllegalArgumentException();
		}
		
		return d1/d2;

		
		
	}
	
}
