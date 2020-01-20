import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the radious and length of a cylinder:");
		double radious = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radious * radious * Math.PI; 
		double volume = area * length;
		
		System.out.println("The area is:" + area);
		System.out.println("The volume is:" + volume);
	}

}
