import java.util.Scanner;
import java.util.Arrays;


public class CollatzRunner
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
      
		
		System.out.print("Starting number? ");
      int numStart = scan.nextInt();
      Collatz collatz = new Collatz(numStart);
      System.out.println(collatz);
      System.out.println(collatz.steps());
		System.out.println(collatz.maxValue());
      System.out.println(collatz.minOddValue());
      System.out.println(Arrays.toString(collatz.oddValues()));
      System.out.println(collatz.sumValues());
       System.out.println(Arrays.toString(collatz.sequence()));
      		
	}
}