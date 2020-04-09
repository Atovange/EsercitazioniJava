public class TestMatematica {
	public static void main(String[] args) {
		Calcolatrice miaCalcolatrice = new Calcolatrice();
		
		int[] v1 = miaCalcolatrice.generaVettore(3);
		int[] v2 = miaCalcolatrice.generaVettore(3);
		int[] v3 = miaCalcolatrice.generaVettore(5);
		
		int[] s1 = miaCalcolatrice.sommaVettori(v1, v2);
		if(s1 != null) {
			for(int i = 0; i < s1.length; i++) {
				System.out.println(s1[i]);
			}
		}
		
		int[] s2 = miaCalcolatrice.sommaVettori(v1, v3);
		if(s2 != null) {
			for(int i = 0; i < s2.length; i++) {
				System.out.println(s2[i]);
			}
		}
	}
}