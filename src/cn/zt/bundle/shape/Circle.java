package cn.zt.bundle.shape;

import cn.zt.common.persistence.Shape;

public class Circle extends Shape {
	private double radius;

	/**
	 * @return radius
	 */

	public double getRadius() {
		return radius;
	}

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * @param radius
	 *            要设置的 radius
	 */

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * (非 Javadoc)
	 * 
	 * 
	 * @return
	 * @see cn.zt.common.persistence.Shape#perimeter()
	 */

	@Override
	protected double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	/**
	 * (非 Javadoc)
	 * 
	 * 
	 * @return
	 * @see cn.zt.common.persistence.Shape#area()
	 */

	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	/**
	 * (非 Javadoc)
	 * 
	 * 
	 * @see cn.zt.common.persistence.Shape#display()
	 */

	@Override
	protected void display() {
		System.out.println("This is a shape:" + name);
	}

}
