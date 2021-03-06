package com.study.day10;

public class ArrayDemo6 {
	public static void main(String[] args) {
		/*
		某公司有18位員工，
		其中10位在去年投資股票，一年的獲利率如下(單位：%)：
		7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5

		另外8位員工投資買公債一年內獲利率如下(單位：%):
		6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
		試分別求此公司的員工投資股票與公債的獲利率變異係數。
		*/
		
		
		double[] invest = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
		double[] debt = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};

		System.out.printf("Stock CV: %.5f\n", Util.calCv(invest));
		System.out.printf("Bond CV: %.5f\n", Util.calCv(debt));
	}

}
