package cn.zt.bundle.shape;

import cn.zt.common.persistence.Shape;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	/**
	 * @return width
	 */

	public double getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            要设置的 width
	 */

	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return length
	 */

	public double getLength() {
		return length;
	}

	/**
	 * @param length
	 *            要设置的 length
	 */

	public void setLength(double length) {
		this.length = length;
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
		return 2*(width+length);
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
		return width*length;
	}

	  
	/** (非 Javadoc)  
	*   
	*     
	* @see cn.zt.common.persistence.Shape#display()  
	*/  
	  
	
	@Override
	protected void display() {
		// TODO Auto-generated method stub
		System.out.println("This is shape:"+name);
	}

	
}
