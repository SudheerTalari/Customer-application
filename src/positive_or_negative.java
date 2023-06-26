import java.util.Scanner;

public class positive_or_negative {
	int a;
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter a number");
	   int a = s.nextInt();
	   if (a > 0) {
		   System.out.println("The given number is positive");
	   }
	   else 
	   System.out.println("The given number is negative");
	}

}
