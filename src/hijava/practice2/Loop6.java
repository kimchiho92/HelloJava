package hijava.practice2;

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
   
		for (int i = 2; i <= 100; i++) {

			boolean isprime = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					isprime = false;

					break;
				}
			}
			if (isprime) {
				total += i;
				System.out.println(i);
			}
		}
		System.out.println("소수의 합계=" + total);
	}
}
