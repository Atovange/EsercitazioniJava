public class Contatore {
	public static void main(String[] args) {
		System.out.println("Hai inserito " + args.length + " argomenti.");
		System.out.println("---");
		for(int i = args.length-1; i >= 0; i--) {
			System.out.println(args[i]);
		}
		System.out.println("---");
		for(int i = 0; i < args.length; i=i+2) {
			System.out.println(args[i]);
		}
		
	}
}