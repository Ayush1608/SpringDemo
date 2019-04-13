package com.spring.tutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape//implements InitializingBean, DisposableBean
{	
	/*private List<Point> points = new ArrayList<Point>();
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw()
	{
		for(Point point : points)
		{
		System.out.println("Point: [" + point.getA() + "," + point.getB() + "]");
		}
	}*/
	
	public void destroyBean()
	{
		System.out.println("Inside created destroy method.");
}
	public void initBean()
	{
		System.out.println("Inside created init method.");
	}

	/*@Override
	public void destroy() throws Exception 
	{
		System.out.println("Inside DisposableBean destroy method.");
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Inside InitializingBean init method.");
	}*/
	
	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;
	
	
//	public Triangle(Point pointOne, Point pointTwo, Point pointThree)
//	{
//		this.pointOne = pointOne;
//		this.pointTwo = pointTwo;
//		this.pointThree = pointThree;
//	}
	
	

	public Point getPointOne() {
		return pointOne;
	}



	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}



	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}



	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}



	public Point getPointTwo() {
		return pointTwo;
	}



	public Point getPointThree() {
		return pointThree;
	}

	public void draw()
	{
		System.out.println("Point One: [" + getPointOne().getA() + "," + getPointOne().getB() + "]");
		System.out.println("Point Two: [" + getPointTwo().getA() + ", " + getPointTwo().getB() + "]");
		System.out.println("Point Three: [" + getPointThree().getA() + "," + getPointThree().getB() + "]");
	}

	
}
