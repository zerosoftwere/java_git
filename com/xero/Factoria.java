package com.xero;

public class Factoria
{
	/**
	 * This method finds the factoria of a number n.
	 * @param n the input number
	 * @return the resulting factoria of n
	 */
	public static int iterativeFactoria(int n)
	{
		int result = 1;
		for (int i = n; i > 1; i--)
			result *= i;
		return result;
	}
	
	/**
	 * This method finds the factoria of a number n.
	 * @param n the input number
	 * @return the resulting factoria of n
	 */
	public static int reculsiveFactoria(int n)
	{
		if (n < 1) return 1;
		return n * reculsiveFactoria(n - 1);
	}
}
