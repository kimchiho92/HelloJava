package hijava.practice2;

public class Loop7 {

	public static void main(String[] args) {
		// T소수 1과 자기 자신을 갖는수이다. 3;/ 1 3 , 5/1 5  1 ~ 100 사이에 존재하는 소수의 합을 구하시오.
		int count = 0;
		for(int i = 2; i<100; i++) {
			for(int j = 2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(i);
			}
			count = 0;
		}
	
	}
}



			
		
	


