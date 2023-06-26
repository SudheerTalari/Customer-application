import java.util.Scanner;

public class swappingwith2variables {
	int a,b;
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c=a;
		a = b;
		b= c;
		System.out.println("after Swappping: "+" a = "+a+" b= "+b);
	}

}
