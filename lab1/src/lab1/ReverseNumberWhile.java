package lab1;
import java.util.Scanner;
public class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int reversenum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your number and press enter: ");
		//This statement will capture the user input Scanner in = new Scanner(System.in);
		//Captured input would be stored in number num
		 num = scan.nextInt();
		//While Loop: Logic to find out the reverse number
		while( num != 0 )
		{
		reversenum = reversenum * 10;
		reversenum = reversenum + num%10;
		num = num/10;
		}
		System.out.println("Reverse of input number is: "+reversenum);
}

}
