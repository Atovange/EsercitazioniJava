public class TestMain {
	public static void main(String[] args) {
		PositiveSet p1 = new PositiveSet(12, 56, 1);
		System.out.println(p1.toString());
		PositiveSet p2 = new PositiveSet(12, 43, 2);
		System.out.println(p2.toString());
		PositiveSet pU = p1.union(p2);
		System.out.println(pU.toString());
		PositiveSet p3 = new PositiveSet(56, 43, 4, 1);
		System.out.println(p3.toString());
		PositiveSet pI = pU.intersection(p3);
		System.out.println(pI.toString());
	}
}