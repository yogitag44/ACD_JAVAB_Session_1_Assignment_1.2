public class Sum {
	
	static int add(int a, int b)   //declared static so need not to create object of this and can be used directly
	{
		while (b!=0) {   //loop till value of integer b is Zero and no carry 
			
			int carry = a & b;  // carry is having common set of bit of integer a and b
			
			a = a ^ b;  //sum of bits where at least one of bit is not set
			
			b = carry << 1; //carry shifted by 1 and adding it to x to get the sum
		}
		return a;  //returning the current value of a
	}
	
	public static void main(String args[]) {
		System.out.println("The sum of two number is: "+ add(70,50));  //passing values of integer a and b in method add and printing output
	}
}
