package org.spring.demo;

public class Triangle {
	
	private String type;
	private int height;
	private int breadth;
	
	

	public Triangle(String type) {
		super();
		this.type = type;
	}

	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}

	
	public Triangle(String type, int height, int breadth) {
		super();
		this.type = type;
		this.height = height;
		this.breadth = breadth;
	}

	public String getType() {
		return type;
	}

	/*
	 * public void setType(String type) { this.type = type; }
	 */

	public int getHeight() {
		return height;
	}

	/*
	 * public void setHeight(int height) { this.height = height; }
	 */
	
	public int getBreadth() {
		return breadth;
	}

	/*
	 * public void setBreadth(int breadth) { this.breadth = breadth; }
	 */

	public void draw()
	{
		System.out.println( getType()+" Triangle of height "+getHeight() + " and breadth "+getBreadth());
	}

}
