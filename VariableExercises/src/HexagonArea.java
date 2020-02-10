import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the side:");
		double side = input.nextDouble();
		
		double a = 3 *  Math.sqrt(3) / 2;
		double area = (Math.pow(side, 2)) * a ;
		
		System.out.printf("The area of the hexagon is" + " " + "%.6f", area  );

	}

}
