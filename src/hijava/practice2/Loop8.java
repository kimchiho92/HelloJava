package hijava.practice2;

import java.util.Scanner;

public class Loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int count = 0;
		int sum = 0;
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					count++;
					// System.out.println(i+"===="+"@@@@"+j+"----"+count+"===="+(i%j));
				}
			}
			if (count == 1) {
				sum += i;
				System.out.println(i);
			}
			count = 0;
		}
		System.out.println("소수의 합은=" + sum);
	}

}
