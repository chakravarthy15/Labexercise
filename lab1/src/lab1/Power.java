package lab1;

public class Power {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int base=3 ,exponent=4 , result =1;
	while (exponent!=0)
	{
		result = result*base;
		--exponent;
			}
System.out.println("the answer is "+ result);	

	}

}
