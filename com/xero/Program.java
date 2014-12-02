package com.xero;

import java.text.MessageFormat;

/**
 * This Program demonstrate iteration vs recursion
 * @version 1.0 2014-11-17
 * @author Ibrahim
 */
class Program
{
	public static void main(String[] args)
	{
		int number = 10;
		if (args.length > 0) number = Integer.parseInt(args[0]);
		long start = System.nanoTime();
		int factorial = reculsiveFactorial(number);
		long end = System.nanoTime();
		System.out.println(MessageFormat.format("The recursive factorial of {0} is: {1} at time cost of: {2} nanoseconds", number, factorial, end - start));
		start = System.nanoTime();
		factorial = iterativeFactorial(number);
		end = System.nanoTime();
		System.out.println(MessageFormat.format("The iterative factorial of {0} is: {1} at time cost of: {2} nanoseconds", number, factorial, end - start));
	}
	
	public static int iterativeFactorial(int n)
	{
		int result = 1;
		for (int i = n; i > 1; i--)
			result *= i;
		return result;
	}
	
	public static int reculsiveFactorial(int n)
	{
		if (n < 1) return 1;
		return n * reculsiveFactorial(n - 1);
	}
}
