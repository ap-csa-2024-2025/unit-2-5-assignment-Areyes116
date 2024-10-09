import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Part A
		System.out.println("Problem 1\n");
		
		Circle c1 = new Circle(10.1);
		Circle c2 = new Circle(14.0);
		Circle c3 = new Circle(20.5);

		System.out.println(c1.toString() + "\n" + c2.toString() + "\n" + c3.toString());
  }
}
