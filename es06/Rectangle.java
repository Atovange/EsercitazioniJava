public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double area() {
		return this.width * this.length;
	}
	
	public double perimeter() {
		return (2*this.width) + (2*this.length);
	}
	
	public void scale(double factor) {
		this.setWidth(this.getWidth()*factor);
		this.setLength(this.getLength()*factor);
	}
	
	public void draw() {
		System.out.println(this);
		System.out.println(" _____");
		System.out.println("|     |");
		System.out.println("|_____|");
	}
	
	public String toString() {
		return super.toString() + ", Width: " + width + ", Length: " + length;
	}
}