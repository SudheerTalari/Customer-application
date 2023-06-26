import java.util.Scanner;

public class swapping {
	int a,b;
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = obj.nextInt();
		int b = obj.nextInt();
		 a = a+b;
		 b = a-b;
		 a = a-b;
		System.out.println("after Swappping: "+" a = "+a+" b= "+b);
	}

}
