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
		int factoria = Factoria.reculsiveFactoria(number);
		long end = System.nanoTime();
		System.out.println(MessageFormat.format("The reculsive factoria of {0} is: {1} at time cost of: {2} nanoseconds", number, factoria, end - start));
		start = System.nanoTime();
		factoria = Factoria.iterativeFactoria(number);
		end = System.nanoTime();
		System.out.println(MessageFormat.format("The iterative factoria of {0} is: {1} at time cost of: {2} nanoseconds", number, factoria, end - start));
	}
}
