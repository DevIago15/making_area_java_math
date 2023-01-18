// Make a program to read the value of the radius of a circle, and then show the value of the area of ​​this circle with four decimal places as examples

package area_math;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// data
		double radius;
		double pi = 3.14159;
		double area;
		
		
		// making the math
		System.out.printf("Write the radius of circle: ");
		radius = sc.nextDouble();
		area = radius * pi * 2; 
		Locale.setDefault(Locale.US);
		System.out.printf("The area of circle is: %.4f", area);
		

	}

}
