public class TestClasses {
	public static void main(String[] args) {
		Razionale r1 = new Razionale(1, 3);
		Razionale r2 = new Razionale(6, 4);
		
		System.out.println(r1.somma(r2).toString());
	}
}