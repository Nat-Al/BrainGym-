import java.util.Scanner;

public class RunawayLength {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter speed and acceleration:");
		
		double speed = input.nextDouble();
		double accelaration = input.nextDouble();
		
		double v = speed * speed;
		double a = 2 * accelaration; 
		
		double length = v/a;
		
		System.out.printf("The minimum runway length for this airplane is" + " " + "%.3f", length );
		
		
	}

}
