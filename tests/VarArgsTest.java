public class VarArgsTest {
	public static void foobar (int ... a) {
		System.out.println(a.toString());
	}
	
	public static void main(String[] args) {
		foobar();
	}
}