package com.study.day06;

public class PointDistance 
{
	private Point point1;
	private Point point2;
	double distance;
	
	public PointDistance(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
		calcDistance();
	}
	public void  calcDistance()
	{
		int dx = point1.getX() - point2.getX();
		int dy = point1.getY() - point2.getY();
		double  d2 = Math.pow(dx, 2) + Math.pow(dy, 2);
		double dxy = Math.sqrt(d2) ;
		distance = dxy;
	}
	public Double getDistance()
	{
		return distance;
	}
	@Override
	public String toString() {
		return "PointDistance [point1=" + point1 + ", point2=" + point2 + ", distance=" + distance + "]";
	}
	
	
	
	
}
