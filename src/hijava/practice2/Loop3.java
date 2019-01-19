package hijava.practice2;

public class Loop3 {

	public static void main(String[] args) {
		//2단 부터 9단 까지  구구단 ; 변수 단	단 안에 변수 설정  총 2개 1~9개 
		for(int i=2; i<=9;i++) {
			System.out.println(i+"단"+"=-============");
			for(int j= 1; j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		
		}
	}
}
