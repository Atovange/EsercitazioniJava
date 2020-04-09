public class SommaMatrici {
	public static void main(String[] args) {
		int[][] matrice1 = new int[3][5];
		int[][] matrice2 = new int[3][5];
		int[][] sommaMatrici = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matrice1[i][j] = (int) Math.floor(Math.random()*99);
				matrice2[i][j] = (int) Math.floor(Math.random()*99);
				sommaMatrici[i][j] = matrice1[i][j] + matrice2[i][j];
				System.out.print(sommaMatrici[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}