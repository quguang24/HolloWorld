
public class Calculator {
	public Calculator() {
		
	}
		
	
	
	public int add(int a,int b) {
		return a + b;
	}
	
	public int subtract(int a,int b) {
		return a - b;
	}
	
	public int multiply(int a,int b) {
		return a * b;
	}
	
	public int divide(int a,int b) {
		return a / b;
	}
	
	public int modulo(int a,int b) {
		return a % b;
	}
	
	public static void main(String[] agsr) {
		
		 Calculator myCalculator = new Calculator();
		    System.out.println(myCalculator.add(12,22));
		    System.out.println(myCalculator.subtract(45,11));
	}
}
  
 