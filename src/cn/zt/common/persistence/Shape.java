package cn.zt.common.persistence;

public abstract class Shape {

	protected String name;

	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return name
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            要设置的 name
	 */

	public void setName(String name) {
		this.name = name;
	}

	protected abstract double perimeter();

	protected abstract double area();

	protected void display(){
		System.out.println("This is a shape.");
	}
}
