import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the monthly saving amount:");
		
		double value = input.nextDouble();
		double interest = 0.05/12;
		double valuef;
		valuef = value * (1 + interest);
		valuef = (value + valuef) *  (1 + interest);
		valuef = (value + valuef) *  (1 + interest);
		valuef = (value + valuef) *  (1 + interest);
		valuef = (value + valuef) *  (1 + interest);
		valuef = (value + valuef) *  (1 + interest);	

		
		System.out.printf("After the sixth month, the account value is" + " " + "%.3f", valuef );
		
		
	


	}

}
