package com.study.day11;

import java.util.Iterator;

public class MultiArrayDemo1 {
	
	public static void main(String[] args) {
		
		
		int[][] m = new int[2][3];
		System.out.println(m);
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.printf("m的長度: %d\n", m.length);
		System.out.printf("m[0]的長度: %d\n", m[0].length);
		System.out.printf("m[1]的長度: %d\n", m[1].length);

		Util.print(m);
		


		//System.out.println(Arrays.toString(null));
		
	}

}
