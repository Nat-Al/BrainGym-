import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        
		 System.out.print("Enter weight in pounds:");
		 double pounds = input.nextDouble();
		 double kilos = pounds * 0.45359237;
		 
		 System.out.print("Enter height in inches:");
		 double height = input.nextDouble();
		 double meters = height * 0.0254;
		 
		 double square =  Math.pow(meters, 2);
		 double bmi = kilos / square;
		 
		System.out.printf("BMI is:" + " " + "%.4f", bmi  );
		 
		 

	}

}
