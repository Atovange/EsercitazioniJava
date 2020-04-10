public class MyStackOverflow extends Exception {
	
	public MyStackOverflow() {
		super("Problema con l'inserimento nello stack");
	}
	
	public String toString() {
		return getMessage() + ": Stack pieno";
	}
}