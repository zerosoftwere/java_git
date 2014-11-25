package com.xero;

class Program
{
	public static void main(String[] args)
	{
		System.out.println(iterativeFactoria(5));
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
