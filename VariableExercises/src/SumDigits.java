import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000:");
		int number = input.nextInt();
		
		int numberA = number % 10;
		number = number / 10;
		int numberB = number % 10;
		number =  number / 10;
		int numberC = number % 10;
		number =  number / 10;
		number =  number + numberA + numberB + numberC ;
		
		System.out.println("The sum of the digits is" + " "  + number);

	}

}
