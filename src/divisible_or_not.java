import java.util.Scanner;

public class divisible_or_not {
	int a,b;
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter 2 number");
	   int a = s.nextInt();
	   int b = s.nextInt();
	   if (a % b ==0) {
		   System.out.println("The given number is divisible");
	   }
	   else 
	   System.out.println("The given number is not divisible");
	}

}
