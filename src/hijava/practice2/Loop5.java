package hijava.practice2;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("높이  입력");
		int line =sc.nextInt(); //i= 입력 받는수 세로 길이 
			
		for(int i= 1;i<=line;i++) {
			for(int j=1;j<(line-1);j++) {
				System.out.println(' ');
			}
			for(int k=1; k<=(2*i-1);k++) {
				System.out.print('*');
			}
		}
		
	}

}
