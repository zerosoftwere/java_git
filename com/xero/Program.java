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
}
