public class Calcolatrice {
	public int[] generaVettore(int L) {
		int[] v = new int[L];
		for(int i = 0; i < L; i++) {
			v[i] = (int) Math.floor(Math.random()*99);
		}
		return v;
	}
	
	public int[][] generaMatrice(int R, int C) {
		int[][] m = new int[R][C];
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				m[i][j] = (int) Math.floor(Math.random()*99);
			}
		}
		return m;
	}
	
	public int[] sommaVettori(int[] a, int[] b) {
		if(a.length == b.length) {
			int[] s = new int[a.length];
			for(int i = 0; i < a.length; i++) {
				s[i] = a[i] + b[i];
			}
			return s;
		}
		return null;
	}
	
	public int[][] sommaMatrici(int[][] a, int[][] b) {
		return null;
	}
}