package com.xero;

class Program
{
	public static void main(String[] args)
	{
		
	}
	
	public static int iterativeFactoria(int n)
	{
		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	}
}
