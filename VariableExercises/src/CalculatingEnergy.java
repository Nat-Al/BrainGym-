import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms:");
		double waterAmount = input.nextDouble();

		System.out.print("Enter the initial temperature:");
		double temperature0 = input.nextDouble();

		System.out.print("Enter the final temperature:");
		double temperature1 = input.nextDouble();
		
		double energy = waterAmount * (temperature1 - temperature0) * 4184;
		
		System.out.printf("The energy needed is" + " " + "%.1f", energy );
		

	}

}
