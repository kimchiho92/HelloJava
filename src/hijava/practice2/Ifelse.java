package hijava.practice2;

public class Ifelse {
	public static void main(String[] args) {
		// System.currentTimeMillis  현재 시각을  밀리세컨드로 보여줌 , 프로그램 성능을 파악하기 위한 정확한 초시계 개념 
		long ctm = System.currentTimeMillis() ;
		System.out.println("ctm=" + ctm);
		
		long sct = ctm % 3;
		
		if (sct == 1) {
			System.out.println("One");
		} else if (sct == 2) {
			System.out.println("Two");
		} else {
			System.out.println("Zero");
		}
	}
}
