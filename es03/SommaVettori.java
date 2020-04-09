import java.lang.Math;

public class SommaVettori {
	public static void main(String[] args) {
		int[] vettore1 = new int[3];
		int[] vettore2 = new int[3];
		int[] sommaVettori = new int[3];
		
		for(int i = 0; i < 3; i++) {
			vettore1[i] = (int) Math.floor(Math.random()*99);
			vettore2[i] = (int) Math.floor(Math.random()*99);
			sommaVettori[i] = vettore1[i] + vettore2[i];
			System.out.println(sommaVettori[i]);
		}
	}
}