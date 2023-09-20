package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		// TODO Auto-generated method stub
		 System.out.println("Input the  range that will be used to find prime numbers: ");
		 int n = in.nextInt();
		 int count = 0;
		 boolean[] primeNumber = new boolean [n+1];
		 for (int number = 2; number <= n; number ++)
		 {
			 primeNumber[number] = true;
		 }
		 for (int number = 2; number <= (number/2); number ++)
		 {
			for (int divtwo = 2 * number; divtwo <= n; divtwo = divtwo + number)
					 {
				 primeNumber[divtwo]=false;
					 }
		 }
		for (int i = 2; i <= n; i ++)
		{
			if (primeNumber[i] = true)
					{
					System.out.println(i);
					}
		}


}
}
