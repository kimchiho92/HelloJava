package hijava.practice2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("메세지를 입력");
			int i =sc.nextInt();
			for( int ii=0;ii<i;ii++) {
				for(int j=0;j<ii;j++) {
					System.out.print('*');
			}
				System.out.println( );
		}
	}
}