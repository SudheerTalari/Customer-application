import java.util.Scanner;

public class even_or_odd {
	int a;
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter a number");
	   int a = s.nextInt();
	   if (a%2 ==0) {
		   System.out.println("The given number is even");
	   }
	   else 
	   System.out.println("The given number is odd");
	}

}
