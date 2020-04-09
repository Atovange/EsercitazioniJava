import java.util.ArrayList;

public class Principale {
	public static void main(String[] args) {
		ArrayList<Persona> miaLista = new ArrayList<>();
		Persona p1 = new Persona("Mario", "Rossi", 18);
		Persona p2 = new Persona("Luigi", "Verdi", 20);
		Persona p3 = new Persona("Paolo", "Neri", 25);
		miaLista.add(p1);
		miaLista.add(p2);
		miaLista.add(p3);
		System.out.println(miaLista.size());
		System.out.println(miaLista.get(1));
		miaLista.remove(1);
		for(int i = 0; i < miaLista.size(); i++) {
			System.out.println(miaLista.get(i).toString());
		}
		for(Persona p : miaLista) {
			System.out.println(p.toString());
		}
		System.out.println(miaLista);
		miaLista.clear();
		System.out.println(miaLista.size());
	}
}