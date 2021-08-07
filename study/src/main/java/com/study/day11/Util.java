package com.study.day11;



public class Util {
	
	public static int getsum(int[] m)
	{
		int sum = 0;
		for(int j = 0;j<m.length;j++)
		{
			sum = sum + m[j];
		}
		return sum;
	}
	
	
	
	public static void print(int[][] m)
	{
		for(int i = 0;i<m.length;i++)
		{
			for(int k = 0;k<m[i].length;k++)
			{
				System.out.printf("m[%d][%d]:%d ", i, k, m[i][k]);
			}
		}


	}

}
