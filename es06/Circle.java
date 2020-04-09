public class Circle extends Shape {
	private double radius;
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double perimeter() {
		return (2 * Math.PI * radius);
	}
	
	public void scale(double factor) {
		this.setRadius(this.getRadius()*factor);
	}
	
	public void draw() {
		System.out.println(this);
		System.out.println(" __ ");
		System.out.println("/  \\");
		System.out.println("\\__/");
	}
	
	public String toString() {
		return super.toString() + ", Radius: " + radius;
	}
}