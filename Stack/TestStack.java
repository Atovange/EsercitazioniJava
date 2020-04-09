import java.util.Scanner;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		System.out.println("Stack \n [a]dd an element \n [r]emove and print an element \n [e]xit");
		while(!exit) {
			System.out.print(" enter a command: ");
			String choice = scanner.next();
			switch(choice) {
				case "a":
					s.push(scanner.next());
					break;
				case "r":
					System.out.println(s.pop());
					break;
				case "e":
					exit = true;
					break;
				default:
					System.out.println("Unknown command");
			}
		}
	}
}