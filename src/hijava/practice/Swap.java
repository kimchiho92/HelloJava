package hijava.practice;

//변수 두개를 주면, 두개의 값을 서로 치환하는 swap() 함수를 작성하시오.
public class Swap {
	int x = 10;
	int y = 100;

	public static void main(String[] args) {
		Swap sw = new Swap();

		System.out.println("x=" + sw.y);
		System.out.println("y=" + sw.x);
		System.out.println("==================");
		sw.sw1();
		System.out.println("x=" + sw.y);
		System.out.println("y=" + sw.x);
	}

	public void sw1() {
		int c= x;
//		int b= y;= 
		x=y;
		y=c;
	}
}