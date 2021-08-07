package com.study.day01;

public class PointDistance 
{
	private Point p1;
	private Point p2;
	private double distance;
	
	//建構式
	public PointDistance(Point p1,Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.distance = calDistance();
	}
	//計算距離的方法
	private double calDistance() 
	{
		double d = Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));
		return d;
	}
	//取得距離的方法

	public double getDistance() {
		return distance;
	}
}
