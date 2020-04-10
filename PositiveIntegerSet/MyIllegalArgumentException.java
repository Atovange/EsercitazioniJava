public class MyIllegalArgumentException extends Exception {
	public MyIllegalArgumentException() {
		super("Valore non valido");
	}
	
	public String toString() {
		return super.toString();
	}
}