public class es01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int i = 10;
		while(i >= 0) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i--;
		}
		
		for(int j = 1; j < 100; j++) {
			boolean isBool = true;
			for(int t = 2; t < j; t++) {
				if(j%t == 0) {
					isBool = false;
				}
			}
			if(isBool) {
				System.out.println(j);
			}
		}
	}
}