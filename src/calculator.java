import java.util.Scanner;

// , write a program to create an arithmetic calculator

public class calculator {

	public static void main(String[] args) 
	{ 
		 Scanner in = new Scanner(System.in);
		 
		    System.out.println("Enter first number :");
	        int num1 = in.nextInt();
	        System.out.println("Enter second number :");
	        int num2 = in.nextInt();

	        int sum 		= num1 + num2;
	        System.out.println("Sum : "         + sum);
	        int difference 	= num1 - num2;
	        System.out.println("Difference : "  + difference);
	        int product 	= num1 * num2;
	        System.out.println("Product : "     + product);
	        int quotient	= num1 / num2;
	        System.out.println("Quotient : "    + quotient);
	        int modulo	    = num1 % num2;
	        System.out.println("Modulo : "      + modulo);
	}

}
