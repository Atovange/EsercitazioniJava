import java.util.ArrayList;

public class Stack {
	private static final int MAX_SIZE = 5;
	private int index = -1;
	private ArrayList<String> array; 
	
	public Stack() {
		array = new ArrayList<>();
	}
	
	public void push(String s) {
		if(!isFull()) {
			index++;
			this.array.add(s);
		} else {
			//throw exception
		}
	}
	
	public String pop() {
		if(!isEmpty()) {
			String s = this.array.remove(index);
			index--;
			return s;
		} else {
			return null;
			//throw exception
		}
	}
	
	public boolean isEmpty() {
		return (index == -1 ? true : false);
	}
	
	public boolean isFull() {
		return (index == MAX_SIZE - 1 ? true : false);
	}
	
	public String toString() {
		return array.toString();
	}
}