package com.xero;

import java.text.MessageFormat;

/**
 * This Program demostrate iteration vs recurlsion
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
		int factoria = reculsiveFactoria(number);
		long end = System.nanoTime();
		System.out.println(MessageFormat.format("The reculsive factoria of {0} is: {1} at time cost of: {2} nanoseconds", number, factoria, end - start));
		start = System.nanoTime();
		factoria = iterativeFactoria(number);
		end = System.nanoTime();
		System.out.println(MessageFormat.format("The iterative factoria of {0} is: {1} at time cost of: {2} nanoseconds", number, factoria, end - start));
	}
	
	public static int iterativeFactoria(int n)
	{
		int result = 1;
		for (int i = n; i > 1; i--)
			result *= i;
		return result;
	}
	
	public static int reculsiveFactoria(int n)
	{
		if (n < 1) return 1;
		return n * reculsiveFactoria(n - 1);
	}
}
