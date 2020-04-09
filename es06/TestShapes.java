import java.util.ArrayList;

public class TestShapes {
	public static void main(String[] args) {
		Square s1 = new Square("rosso", true, 50);
		Circle c1 = new Circle("blu", false, 12.5);
		Rectangle r1 = new Rectangle("verde", true, 17, 19);
		Circle c2 = new Circle("rosso", true, 2);
		Rectangle r2 = new Rectangle("verde", true, 111, 12.4);
		Rectangle r3 = new Rectangle("giallo", false, 7, 0.6);
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(c1);
		shapes.add(r1);
		shapes.add(c2);
		shapes.add(r2);
		shapes.add(r3);
		for(int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw();
		}
	}
}