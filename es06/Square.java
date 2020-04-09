public class Square extends Rectangle {
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}
	
	public void setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	public double getSide() {
		return this.getWidth();
	}
	
	public void draw() {
		System.out.println(this);
		System.out.println(" ___");
		System.out.println("|   |");
		System.out.println("|___|");
	}
	
	public String toString() {
		return "Color: " + this.getColor() + ", Filled: " + this.getFilled() + ", Side: " + this.getWidth();
	}
}