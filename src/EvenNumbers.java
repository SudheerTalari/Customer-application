import java.util.Scanner;

public class EvenNumbers {
	int a,b;
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
	   System.out.println("Enter 2 number");
	   int a = s.nextInt();
	   int b = s.nextInt();
	  for ( int i=a;i<=b;i++) {
	  if (i % 2 ==0 )
	  System.out.println(i);
	 }	
   }
}