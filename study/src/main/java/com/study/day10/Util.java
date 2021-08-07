package com.study.day10;

import java.security.PublicKey;

public class Util {
	public static int getMax(int[] array)
	{
		int max = 0;
		
		for(int i =0;i<array.length;i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] array)
	{
		int min = 100;
		
		for(int i =0;i<array.length;i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		return min;
	}
	public static double getSum(int[] array)
	{
		double sum = 0;
		for(int i = 0;i<array.length;i++)
		{
			sum += array[i];
		}
		return sum;
	}
	
	public static double getSum(double[] array)
	{
		double sum = 0;
		for(int i = 0;i<array.length;i++)
		{
			sum += array[i];
		}
		return sum;
	}
	
	//計算平均
	public static double getAvg(int[] array)
	{
		double sum = getSum(array);
		double avg = sum / (double)array.length;
		return avg;
	}
	
	
	public static double getAvg(double[] array)
	{
		double sum = getSum(array);
		double avg = sum / (double)array.length;
		return avg;
	}
	
	public static void sortASC(int[] array)
	{
		for (int i =0;i < array.length-1;i++)
		{
			int a = array[i];
			int b = array[i+1];
			if (b < a)
			{
				array[i] = b;
				array[i+1] = a;
			} 
		}
	}
	
	
	
	public static double calCv(double[] array)
	{
		double avg = Util.getAvg(array);
		double sum = 0;
		
		for(int i =0;i<array.length;i++)
		{
			sum += Math.pow(array[i] - avg, 2);
		}
		
		double sd = Math.sqrt(sum / array.length);
		double cv = sd / avg;
		return cv;
	}
	
	public static Double calCv(int[] array)
	{
		int[] height = {172,168,164,170,176};
		int[] weight = {62, 57, 58, 64, 64};
		double h_avg = Util.getAvg(height);
		double h_sum = 0;
		for(int i =0;i<height.length;i++)
		{
			h_sum += Math.pow(height[i] - h_avg, 2);
		}
		double sd = Math.sqrt(h_sum / height.length);
		double cv = sd / h_avg;
		return cv;
	}
}
