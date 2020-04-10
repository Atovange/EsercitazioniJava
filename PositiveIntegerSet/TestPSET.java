import java.util.Scanner;

public class TestPSET {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*
		PositiveIntegerSet pset1 = new PositiveIntegerSet(23, 89, 12, 10);
		PositiveIntegerSet pset2 = new PositiveIntegerSet(34, 2);
		PositiveIntegerSet psetU = pset1.union(pset2);
		System.out.println(pset1 + " U " + pset2 + " = " + psetU);
		PositiveIntegerSet pset3 = new PositiveIntegerSet(89, 12, 52, 34);
		PositiveIntegerSet psetI = psetU.intersection(pset3);
		System.out.println(psetU + " I " + pset3 + " = " + psetI);
		PositiveIntegerSet pset4 = new PositiveIntegerSet(89);
		PositiveIntegerSet psetD = psetI.difference(pset4);
		System.out.println(psetI + " - " + pset4 + " = " + psetD);
		
		System.out.print("Inserisci un positivo: ");
		try {
			int pos = Integer.parseInt(s.next());
			psetD.insertElement(pos);
		}
		catch(MyIllegalArgumentException e) {
			System.out.println("Valore non positivo");
		}
		catch(NumberFormatException e) {
			System.out.println("Inserire un numero");
		}
		System.out.println(psetD);
		*/
		
		SmallIntegerSet sset1 = new SmallIntegerSet(90, 120, 12);
		SmallIntegerSet sset2 = new SmallIntegerSet(123, 23, 56);
		SmallIntegerSet sset3 = (SmallIntegerSet) sset1.union(sset2);
		System.out.println(sset3);
	}
}