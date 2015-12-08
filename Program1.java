import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		//I used float 32-bit instead of double which is  64-bit  
		float length;
		float width;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		//Used a scanner to get user input
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Length");
		length = scan1.nextFloat();
		
		System.out.println("Enter Width");
		width = scan1.nextFloat();
		//multiply length and width
		float area = (length * width);
		System.out.print("area = ");
		System.out.println(area);
		
		
		float perimeter = (2 * width + 2 * length);
		System.out.print("perimeter = ");
		System.out.println(perimeter);
		
	}

}
