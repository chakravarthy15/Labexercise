package lab1;

public class SwapNumber {
	public static void main(String[]args) {
		int  first =120 , second=220;
		System.out.println("Before swap .....");
		System.out.println("the first number is ....="+first);
		System.out.println("the second number  is ....="+second);
		first =first - second;
		second= first +second ;
		first = second-first;
		
		System.out.println("After swap .....");
		System.out.println("the first number is ....="+first);
		System.out.println("the second number  is ....="+second);
}
}