//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer test1 = new NumberAnalyzer("8 13 10 6 3 7 8 22");
		System.out.println(test1);
		System.out.println("odd count = "+test1.countOdds());
		System.out.println("even count = "+test1.countEvens());
		System.out.println("perfect count = "+test1.countPerfects()+"\n\n");

		NumberAnalyzer test2 = new NumberAnalyzer("7 42 9 48 1 14 468 2");
		System.out.println(test2);
		System.out.println("odd count = "+test2.countOdds());
		System.out.println("even count = "+test2.countEvens());
		System.out.println("perfect count = "+test2.countPerfects()+"\n\n");

		NumberAnalyzer test3 = new NumberAnalyzer("19 87 4 68 2 93 7 41");
		System.out.println(test3);
		System.out.println("odd count = "+test3.countOdds());
		System.out.println("even count = "+test3.countEvens());
		System.out.println("perfect count = "+test3.countPerfects()+"\n\n");

	}
}